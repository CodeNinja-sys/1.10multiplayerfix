/*
 * Decompiled with CFR 0.150.
 */
import java.net.UnknownHostException;

class fb
implements Runnable {
    final /* synthetic */ aun a;

    fb(aun aun2) {
        this.a = aun2;
    }

    @Override
    public void run() {
        try {
            aun.b(this.a).i().a(aun.a(this.a));
        }
        catch (UnknownHostException unknownHostException) {
            aun.a((aun)this.a).e = -1L;
            aun.a((aun)this.a).d = (Object)((Object)aug.e) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            aun.a((aun)this.a).e = -1L;
            aun.a((aun)this.a).d = (Object)((Object)aug.e) + "Can't connect to server.";
        }
    }
}

