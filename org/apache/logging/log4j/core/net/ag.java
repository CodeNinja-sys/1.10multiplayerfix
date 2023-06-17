/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.net.Socket;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.SocketServer;

class ag
extends Thread {
    private final ObjectInputStream b;
    private boolean c = false;
    final /* synthetic */ SocketServer a;

    public ag(SocketServer socketServer, Socket socket) {
        this.a = socketServer;
        this.b = new ObjectInputStream(socket.getInputStream());
    }

    public void a() {
        this.c = true;
        this.interrupt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block11: {
            boolean bl2 = false;
            try {
                try {
                    while (!this.c) {
                        h h2 = (h)this.b.readObject();
                        if (h2 == null) continue;
                        SocketServer.a(this.a, h2);
                    }
                }
                catch (EOFException eOFException) {
                    bl2 = true;
                }
                catch (OptionalDataException optionalDataException) {
                    SocketServer.a(this.a).b("OptionalDataException eof=" + optionalDataException.eof + " length=" + optionalDataException.length, (Throwable)optionalDataException);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    SocketServer.a(this.a).b("Unable to locate LogEvent class", (Throwable)classNotFoundException);
                }
                catch (IOException iOException) {
                    SocketServer.a(this.a).b("IOException encountered while reading from socket", (Throwable)iOException);
                }
                if (bl2) break block11;
                try {
                    this.b.close();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            finally {
                SocketServer.b(this.a).remove(this.getId());
            }
        }
    }
}

