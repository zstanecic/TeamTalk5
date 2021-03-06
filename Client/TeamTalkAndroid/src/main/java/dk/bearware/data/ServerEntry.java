/*
 * Copyright (c) 2005-2018, BearWare.dk
 * 
 * Contact Information:
 *
 * Bjoern D. Rasmussen
 * Kirketoften 5
 * DK-8260 Viby J
 * Denmark
 * Email: contact@bearware.dk
 * Phone: +45 20 20 54 59
 * Web: http://www.bearware.dk
 *
 * This source code is part of the TeamTalk SDK owned by
 * BearWare.dk. Use of this file, or its compiled unit, requires a
 * TeamTalk SDK License Key issued by BearWare.dk.
 *
 * The TeamTalk SDK License Agreement along with its Terms and
 * Conditions are outlined in the file License.txt included with the
 * TeamTalk SDK distribution.
 *
 */

package dk.bearware.data;

public class ServerEntry {

    //key names from 'serverentry_preferences'
    public static final String KEY_SERVERNAME = "servername",
                               KEY_IPADDR = "ipaddr",
                               KEY_TCPPORT = "tcpport",
                               KEY_UDPPORT = "udpport",
                               KEY_USERNAME = "username",
                               KEY_PASSWORD = "password",
                               KEY_WEBLOGIN = "bearwarelogin",
                               KEY_NICKNAME = "nickname",
                               KEY_CHANNEL = "channel",
                               KEY_CHANPASSWD = "chanpasswd",
                               KEY_REMEMBER_LAST_CHANNEL = "remember_last_channel",
                               KEY_ENCRYPTED = "encrypted";
    
    public String servername = "";
    public String ipaddr = "";
    public int tcpport = 0, udpport = 0;
    public String username = "", password = "";
    public String nickname = "";
    public String channel = "", chanpasswd = "";
    public boolean rememberLastChannel = true;
    public boolean encrypted = false;
    public boolean public_server = false;
}
