package com.codeWithArsalon.Adapter.excercise;

import com.codeWithArsalon.Adapter.excercise.Gmail.GmailClient;

public class GmailAdapter {
    GmailClient gmailClient;

    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    public void downloadEmails(){
       gmailClient.connect();
       gmailClient.getEmails();
       gmailClient.disconnect();
    }
}
