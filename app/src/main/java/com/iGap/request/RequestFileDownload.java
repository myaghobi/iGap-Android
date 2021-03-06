/*
* This is the source code of iGap for Android
* It is licensed under GNU AGPL v3.0
* You should have received a copy of the license in this archive (see LICENSE).
* Copyright © 2017 , iGap - www.iGap.net
* iGap Messenger | Free, Fast and Secure instant messaging application
* The idea of the RooyeKhat Media Company - www.RooyeKhat.co
* All rights reserved.
*/


package com.iGap.request;

import com.iGap.proto.ProtoFileDownload;

public class RequestFileDownload {

    public void download(String token, long offset, int maxLimit, ProtoFileDownload.FileDownload.Selector selector, String identity) {
        ProtoFileDownload.FileDownload.Builder builder = ProtoFileDownload.FileDownload.newBuilder();

        if (token == null) {
            return;
        }

        builder.setToken(token);
        builder.setOffset(offset);
        builder.setMaxLimit(maxLimit);
        builder.setSelector(selector);

        try {
            RequestWrapper requestWrapper = new RequestWrapper(705, builder, identity);
            RequestQueue.sendRequest(requestWrapper);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}