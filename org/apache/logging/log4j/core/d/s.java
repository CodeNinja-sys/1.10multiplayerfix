/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import org.apache.logging.log4j.d;

public final class s {
    private static final d a = org.apache.logging.log4j.d.d.k();

    private s() {
    }

    public static String a() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostName();
        }
        catch (UnknownHostException unknownHostException) {
            try {
                Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
                while (enumeration.hasMoreElements()) {
                    NetworkInterface networkInterface = enumeration.nextElement();
                    Enumeration<InetAddress> enumeration2 = networkInterface.getInetAddresses();
                    while (enumeration2.hasMoreElements()) {
                        String string;
                        InetAddress inetAddress = enumeration2.nextElement();
                        if (inetAddress.isLoopbackAddress() || (string = inetAddress.getHostName()) == null) continue;
                        return string;
                    }
                }
            }
            catch (SocketException socketException) {
                a.b("Could not determine local host name", (Throwable)unknownHostException);
                return "UNKNOWN_LOCALHOST";
            }
            a.b("Could not determine local host name", (Throwable)unknownHostException);
            return "UNKNOWN_LOCALHOST";
        }
    }
}

