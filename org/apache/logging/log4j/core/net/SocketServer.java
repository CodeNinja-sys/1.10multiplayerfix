/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.core.a;
import org.apache.logging.log4j.core.config.f;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.af;
import org.apache.logging.log4j.core.net.ag;
import org.apache.logging.log4j.d;

public class SocketServer
extends a
implements Runnable {
    private final d a;
    private static final int b = 65534;
    private volatile boolean c = true;
    private final ServerSocket d;
    private final ConcurrentMap e = new ConcurrentHashMap();

    public SocketServer(int n2) {
        this.d = new ServerSocket(n2);
        this.a = org.apache.logging.log4j.c.b(this.getClass().getName() + '.' + n2);
    }

    public static void main(String[] arrstring) {
        String string;
        if (arrstring.length < 1 || arrstring.length > 2) {
            System.err.println("Incorrect number of arguments");
            SocketServer.b();
            return;
        }
        int n2 = Integer.parseInt(arrstring[0]);
        if (n2 <= 0 || n2 >= 65534) {
            System.err.println("Invalid port number");
            SocketServer.b();
            return;
        }
        if (arrstring.length == 2 && arrstring[1].length() > 0) {
            f.a(new af(arrstring[1]));
        }
        SocketServer socketServer = new SocketServer(n2);
        Thread thread = new Thread(socketServer);
        thread.start();
        Charset charset = Charset.defaultCharset();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, charset));
        while (!((string = bufferedReader.readLine()) == null || string.equalsIgnoreCase("Quit") || string.equalsIgnoreCase("Stop") || string.equalsIgnoreCase("Exit"))) {
        }
        socketServer.a();
        thread.join();
    }

    private static void b() {
        System.out.println("Usage: ServerSocket port configFilePath");
    }

    public void a() {
        this.c = false;
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        while (this.c) {
            try {
                Socket socket = this.d.accept();
                socket.setSoLinger(true, 0);
                ag object = new ag(this, socket);
                this.e.put(object.getId(), object);
                object.start();
            }
            catch (IOException iOException) {
                System.out.println("Exception encountered on accept. Ignoring. Stack Trace :");
                iOException.printStackTrace();
            }
        }
        for (Map.Entry entry : this.e.entrySet()) {
            ag ag2 = (ag)entry.getValue();
            ag2.a();
            try {
                ag2.join();
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    static /* synthetic */ void a(SocketServer socketServer, h h2) {
        socketServer.a(h2);
    }

    static /* synthetic */ d a(SocketServer socketServer) {
        return socketServer.a;
    }

    static /* synthetic */ ConcurrentMap b(SocketServer socketServer) {
        return socketServer.e;
    }
}

