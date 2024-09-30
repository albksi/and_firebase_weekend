package com.google.firebase.udacity.friendlychat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;

public class FriendlyMessageMessagingService extends FirebaseMessagingService {

    private static final String TAG = "FriendlyMessageFirebaseMsgService";


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Handle the message
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
    }
}

