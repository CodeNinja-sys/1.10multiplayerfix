/*
 * Decompiled with CFR 0.150.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

class asg
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ bqn c;

    asg(bqn bqn2, String string, String string2, int n2) {
        this.c = bqn2;
        this.a = string2;
        this.b = n2;
        super(string);
    }

    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            if (bqn.a(this.c)) {
                return;
            }
            inetAddress = InetAddress.getByName(this.a);
            bqn.a(this.c, sz.a(inetAddress, this.b, this.c.u.u.f()));
            bqn.b(this.c).a(new afm(bqn.b(this.c), this.c.u, bqn.c(this.c)));
            bqn.b(this.c).a(new atm(210, this.a, this.b, dfj.d));
            bqn.b(this.c).a(new aza(this.c.u.M().e()));
        }
        catch (UnknownHostException unknownHostException) {
            if (bqn.a(this.c)) {
                return;
            }
            bqn.f().b("Couldn't connect to server", (Throwable)unknownHostException);
            this.c.u.a(new chp(bqn.c(this.c), "connect.failed", new du("disconnect.genericReason", "Unknown host")));
        }
        catch (Exception exception) {
            if (bqn.a(this.c)) {
                return;
            }
            bqn.f().b("Couldn't connect to server", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = inetAddress + ":" + this.b;
                string = string.replaceAll(string2, "");
            }
            this.c.u.a(new chp(bqn.c(this.c), "connect.failed", new du("disconnect.genericReason", string)));
        }
    }
}

