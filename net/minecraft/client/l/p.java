/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import net.minecraft.client.l.f;
import net.minecraft.client.l.l;

public class p
extends Thread {
    private final l a;
    private final InetAddress b;
    private final MulticastSocket c;

    public p(l l2) {
        super("LanServerDetector #" + f.a().incrementAndGet());
        this.a = l2;
        this.setDaemon(true);
        this.c = new MulticastSocket(4445);
        this.b = InetAddress.getByName("224.0.2.60");
        this.c.setSoTimeout(5000);
        this.c.joinGroup(this.b);
    }

    @Override
    public void run() {
        byte[] arrby = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length);
            try {
                this.c.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                f.b().b("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            f.b().a("{}: {}", datagramPacket.getAddress(), string);
            this.a.a(string, datagramPacket.getAddress());
        }
        try {
            this.c.leaveGroup(this.b);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.c.close();
    }
}

