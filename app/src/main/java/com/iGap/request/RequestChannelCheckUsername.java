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

import com.iGap.proto.ProtoChannelCheckUsername;

public class RequestChannelCheckUsername {

    public void channelCheckUsername(long roomId, String username) {
        ProtoChannelCheckUsername.ChannelCheckUsername.Builder builder = ProtoChannelCheckUsername.ChannelCheckUsername.newBuilder();
        builder.setRoomId(roomId);
        builder.setUsername(username);

        RequestWrapper requestWrapper = new RequestWrapper(418, builder);
        try {
            RequestQueue.sendRequest(requestWrapper);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
