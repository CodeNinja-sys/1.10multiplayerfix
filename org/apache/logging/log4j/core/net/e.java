/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import org.apache.logging.log4j.d;

public class e
extends OutputStream {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private static final int b = 8;
    private static final int c = 16;
    private static final int d = 24;
    private DatagramSocket e;
    private final InetAddress f;
    private final int g;
    private byte[] h;
    private final byte[] i;
    private final byte[] j;

    public e(String string, int n2, byte[] arrby, byte[] arrby2) {
        this.g = n2;
        this.i = arrby;
        this.j = arrby2;
        try {
            this.f = InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            String string2 = "Could not find host " + string;
            a.b(string2, (Throwable)unknownHostException);
            throw new org.apache.logging.log4j.core.a.d(string2, unknownHostException);
        }
        try {
            this.e = new DatagramSocket();
        }
        catch (SocketException socketException) {
            String string3 = "Could not instantiate DatagramSocket to " + string;
            a.b(string3, (Throwable)socketException);
            throw new org.apache.logging.log4j.core.a.d(string3, socketException);
        }
    }

    @Override
    public synchronized void write(byte[] arrby, int n2, int n3) {
        this.a(arrby, n2, n3);
    }

    @Override
    public synchronized void write(int n2) {
        this.a(new byte[]{(byte)(n2 >>> 24), (byte)(n2 >>> 16), (byte)(n2 >>> 8), (byte)n2}, 0, 4);
    }

    @Override
    public synchronized void write(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void flush() {
        try {
            if (this.h != null && this.e != null && this.f != null) {
                if (this.j != null) {
                    this.a(this.j, 0, this.j.length);
                }
                DatagramPacket datagramPacket = new DatagramPacket(this.h, this.h.length, this.f, this.g);
                this.e.send(datagramPacket);
            }
        }
        finally {
            this.h = null;
            if (this.i != null) {
                this.a(this.i, 0, this.i.length);
            }
        }
    }

    @Override
    public synchronized void close() {
        if (this.e != null) {
            if (this.h != null) {
                this.flush();
            }
            this.e.close();
            this.e = null;
        }
    }

    private void a(byte[] arrby, int n2, int n3) {
        int n4 = this.h == null ? 0 : this.h.length;
        byte[] arrby2 = new byte[n3 + n4];
        if (this.h != null) {
            System.arraycopy(this.h, 0, arrby2, 0, this.h.length);
        }
        System.arraycopy(arrby, n2, arrby2, n4, n3);
        this.h = arrby2;
    }
}

