package com.dev4free.devbuy.devbuyWeb.mapper;

import java.util.List;

import com.dev4free.devbuy.devbuyWeb.po.Banner;
import com.dev4free.devbuy.devbuyWeb.poCustom.BannerCustom;

public interface BannerMapper {
    int deleteByPrimaryKey(String bnId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(String bnId);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
    
    
    
    
    /**
     * 查询所有的banner项
     * @return
     */
   List<BannerCustom> queryAllBanners();
    

   
   
   
   /**
    * 根据主键查询自定义的banner
    */
   
   BannerCustom  selectBannerCustomByPrimaryKey(String bnId);   
   
   
   
   
   /**
    * 根据非空字段查询Banner信息
    * @param bannerCustom
    * @return
    */
   List<BannerCustom> selectSelective(BannerCustom bannerCustom);
   
   
   
   
   
   /**
    * 根据banner的id。批量删除banner
    * @param bnIds
    */
   void deleteBannerByIds(String[] bnIds);
   
   
   
}