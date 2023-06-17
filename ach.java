/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class ach
extends Thread {
    private final vu a;
    private final InetAddress b;
    private final MulticastSocket c;

    public ach(vu vu2) {
        super("LanServerDetector #" + alx.a().incrementAndGet());
        this.a = vu2;
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
                alx.b().b("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            alx.b().a("{}: {}", datagramPacket.getAddress(), string);
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

