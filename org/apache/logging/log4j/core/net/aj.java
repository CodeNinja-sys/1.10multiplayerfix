/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import org.apache.logging.log4j.core.a.y;
import org.apache.logging.log4j.core.net.ah;

class aj
extends Thread {
    private final CountDownLatch b = new CountDownLatch(1);
    private boolean c = false;
    private final Object d;
    final /* synthetic */ ah a;

    public aj(ah ah2, y y2) {
        this.a = ah2;
        this.d = y2;
    }

    public void a() {
        try {
            this.b.await();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    public void b() {
        this.c = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (!this.c) {
            try {
                aj.sleep(ah.a(this.a));
                Socket socket = this.a.a(this.a.c, this.a.e);
                OutputStream outputStream = socket.getOutputStream();
                Object object = this.d;
                synchronized (object) {
                    try {
                        ah.b(this.a).close();
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    ah.a(this.a, outputStream);
                    ah.a(this.a, socket);
                    ah.a(this.a, null);
                    this.c = true;
                }
                ah.f().a("Connection to " + this.a.d + ":" + this.a.e + " reestablished.");
            }
            catch (InterruptedException interruptedException) {
                ah.g().a("Reconnection interrupted.");
            }
            catch (ConnectException connectException) {
                ah.h().a(this.a.d + ":" + this.a.e + " refused connection");
            }
            catch (IOException iOException) {
                ah.m().a("Unable to reconnect to " + this.a.d + ":" + this.a.e);
            }
            finally {
                this.b.countDown();
            }
        }
    }
}

