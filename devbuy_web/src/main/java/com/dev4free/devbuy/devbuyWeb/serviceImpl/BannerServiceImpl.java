package com.dev4free.devbuy.devbuyWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev4free.devbuy.devbuyWeb.mapper.BannerMapper;
import com.dev4free.devbuy.devbuyWeb.mapper.ItemsMapper;
import com.dev4free.devbuy.devbuyWeb.po.Banner;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;
import com.dev4free.devbuy.devbuyWeb.service.BannerService;
import com.dev4free.devbuy.devbuyWeb.utils.TimeUtils;
import com.dev4free.devbuy.devbuyWeb.utils.UUIDUtils;

public class BannerServiceImpl implements BannerService{

	
	
	@Autowired
	BannerMapper bannerMapper;
	@Autowired 
	ItemsMapper itemsMapper;
	
	public List<BannerCustom> queryAllBanners() {
		// TODO Auto-generated method stub
		return bannerMapper.queryAllBanners();
	}


	public BannerCustom selectBannerCustomByPrimaryKey(String bnId) {
		// TODO Auto-generated method stub
		return bannerMapper.selectBannerCustomByPrimaryKey(bnId);
	}


	public void insertBanner(Banner banner) {
		// TODO Auto-generated method stub
		bannerMapper.insert(banner);
	}


	public List<BannerCustom> selectSelective(BannerCustom bannerCustom) {
		// TODO Auto-generated method stub
		return bannerMapper.selectSelective(bannerCustom);
	}


	public void updateBannerAndupdateItems(BannerCustom bannerCustom, ItemsCustom itemsCustom) {
		// TODO Auto-generated method stub
		bannerCustom.setBnModifytime(TimeUtils.getNow());
		bannerMapper.updateByPrimaryKeySelective(bannerCustom);
		itemsCustom.setItemsId(bannerCustom.getItemsId());
		itemsMapper.updateByPrimaryKeySelective(itemsCustom);
	}


	public void insertBannerAndInsertItems(BannerCustom bannerCustom, ItemsCustom itemsCustom) {
		// TODO Auto-generated method stub
		String itemsId = UUIDUtils.getId();
		itemsCustom.setItemsId(itemsId);
		itemsMapper.insert(itemsCustom);
		bannerCustom.setItemsId(itemsId);
		bannerCustom.setBnId(UUIDUtils.getId());
		bannerCustom.setBnCreatetime(TimeUtils.getNow());
		bannerMapper.insert(bannerCustom);

	}


	public void deleteBannerByIds(String[] bnIds) {
		// TODO Auto-generated method stub
		bannerMapper.deleteBannerByIds(bnIds);
	}

}
