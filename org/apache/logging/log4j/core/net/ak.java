/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.net.ah;
import org.apache.logging.log4j.core.net.ai;

public class ak
implements x {
    protected ak() {
    }

    public ah a(String string, ai ai2) {
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName(ai.a(ai2));
        }
        catch (UnknownHostException unknownHostException) {
            ah.n().b("Could not find address of " + ai.a(ai2), (Throwable)unknownHostException);
            return null;
        }
        try {
            Socket socket = new Socket(ai.a(ai2), ai.b(ai2));
            OutputStream outputStream = socket.getOutputStream();
            return new ah(string, outputStream, socket, inetAddress, ai.a(ai2), ai.b(ai2), ai.c(ai2), ai.d(ai2), ai.e(ai2));
        }
        catch (IOException iOException) {
            ah.o().b("TCPSocketManager (" + string + ") " + iOException);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (ai.c(ai2) == 0) {
                return null;
            }
            return new ah(string, byteArrayOutputStream, null, inetAddress, ai.a(ai2), ai.b(ai2), ai.c(ai2), ai.d(ai2), ai.e(ai2));
        }
    }
}

