// MobileStore.java
package com.jap.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class MobileStore {

    private List<Mobile> allMobiles;

    public MobileStore() {
        allMobiles = new ArrayList<>();
    }

    public List<Mobile> readMobileData(String fileName) {
        // Implement this method as described in the previous responses.
        // Make sure to read the mobile data from the CSV file and populate the 'allMobiles' list.
        return allMobiles;
    }

    public List<Mobile> findPhoneByBrand(String brandName, List<Mobile> mobileList) {
        List<Mobile> mobilesByBrand = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (mobile.getBrandName().equalsIgnoreCase(brandName)) {
                mobilesByBrand.add(mobile);
            }
        }
        return mobilesByBrand;
    }

    public List<Mobile> findPhoneCostMoreThan$500(List<Mobile> mobileList) {
        List<Mobile> mobilesMoreThan500 = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (mobile.getCost() > 500) {
                mobilesMoreThan500.add(mobile);
            }
        }
        return mobilesMoreThan500;
    }

    public List<Mobile> findPhonePixelMoreThan12MP(List<Mobile> mobileList) {
        List<Mobile> mobilesMoreThan12MP = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (mobile.getCameraPixels() > 12) {
                mobilesMoreThan12MP.add(mobile);
            }
        }
        return mobilesMoreThan12MP;
    }
}
