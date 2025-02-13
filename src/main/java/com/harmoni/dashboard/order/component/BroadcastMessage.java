package com.harmoni.dashboard.order.component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BroadcastMessage {

    public static final String LOGIN_SUCCESS = "LOGIN_SUCCESS";
    public static final String UN_AUTHORIZED = "UN_AUTHORIZED";

    public static final String STORE_INSERT_FAILED = "STORE_INSERT_FAILED";
    public static final String CHAIN_INSERT_SUCCESS = "CHAIN_INSERT_SUCCESS";
    public static final String CHAIN_SUCCESS_UPDATED = "CHAIN_SUCCESS_UPDATED";
    public static final String BRAND_INSERT_SUCCESS = "BRAND_INSERT_SUCCESS";
    public static final String BRAND_SUCCESS_UPDATED = "BRAND_SUCCESS_UPDATED";
    public static final String TIER_INSERT_SUCCESS = "TIER_INSERT_SUCCESS";

    public static final String TIER_UPDATED_SUCCESS = "TIER_UPDATED_SUCCESS";
    public static final String TIER_DELETED_SUCCESS = "TIER_DELETED_SUCCESS";
    public static final String STORE_INSERT_SUCCESS = "STORE_INSERT_SUCCESS";
    public static final String STORE_UPDATED_SUCCESS = "STORE_UPDATED_SUCCESS";

    public static final String CATEGORY_INSERT_SUCCESS = "CATEGORY_INSERT_SUCCESS";
    public static final String CATEGORY_UPDATED_SUCCESS = "CATEGORY_UPDATED_SUCCESS";

    public static final String PRODUCT_INSERT_SUCCESS = "PRODUCT_INSERT_SUCCESS";
    public static final String PRODUCT_UPDATE_SUCCESS = "PRODUCT_UPDATE_SUCCESS";

    public static final String CHAIN_INSERT_FAILED = "CHAIN_INSERT_FAILED";
    public static final String BRAND_INSERT_FAILED = "BRAND_INSERT_FAILED";

    public static final String TIER_INSERT_FAILED = "TIER_INSERT_FAILED";
    public static final String PROCESS_FAILED = "PROCESS_FAILED";
    public static final String BAD_REQUEST_FAILED = "BAD_REQUEST_FAILED";


    public static final String ADD_PRODUCT = "ADD_PRODUCT";
    public static final String UPDATE_PRODUCT = "UPDATE_PRODUCT";
    public static final String CANCEL_PRODUCT = "CANCEL_PRODUCT";

    private String type;
    private Object data;
}
