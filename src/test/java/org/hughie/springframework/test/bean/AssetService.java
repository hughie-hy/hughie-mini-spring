package org.hughie.springframework.test.bean;

public class AssetService {

    private AssetDao assetDao;

    public void queryAssert(){
        System.out.println("query asset 8000");
    }

    public void queryAssert(String bankName) {
        assetDao.queryAsset(bankName);
    }

}
