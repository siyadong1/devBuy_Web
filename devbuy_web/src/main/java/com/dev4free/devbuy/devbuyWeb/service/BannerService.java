package com.dev4free.devbuy.devbuyWeb.service;

import java.util.List;

import org.apache.coyote.http11.filters.VoidInputFilter;

import com.dev4free.devbuy.devbuyWeb.po.Banner;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.ItemsCustom;

/**
 * 
 * @author syd
 * @date:2016年11月28日
 * @project_name:devbuy_web
 * @description:Banner的相关操作
 */
public interface BannerService {

	
	/**
	 * 查询所有的banner条目
	 * @return
	 */
	List<BannerCustom> queryAllBanners();
	
	
	
	
	
	/**
	 * 根据banner的主键查询自定义的banner
	 * @param bnId
	 * @return
	 */
	BannerCustom selectBannerCustomByPrimaryKey(String bnId);  
	
	
	
	/**
	 * 新增banner
	 * @param banner
	 */
	void insertBanner(Banner banner);
	
	
	
	
	/**
	 * 
	 * @param bannerCustom
	 * @return
	 */
	List<BannerCustom>  selectSelective(BannerCustom bannerCustom);

	
	
	
	/**
	 * 更新banner同时更新banner对于的商品
	 * @param bannerCustom
	 * @param itemsCustom
	 */
	void updateBannerAndupdateItems(BannerCustom bannerCustom,ItemsCustom itemsCustom);

	
	
	
	
	
	/**
	 * 新增banner并且新增banner对于的商品信息
	 * @param bannerCustom
	 * @param itemsCustom
	 */
	void insertBannerAndInsertItems(BannerCustom bannerCustom,ItemsCustom itemsCustom);
	
	
	
	/**
	 * 根据banner的id。批量的删除banner
	 * @param bnIds
	 */
	void deleteBannerByIds(String[] bnIds);
	
	
}
