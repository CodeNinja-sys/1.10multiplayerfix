/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.a.b;
import com.c.a.e;
import java.math.BigInteger;

class tn
extends Thread {
    final /* synthetic */ pd a;

    tn(pd pd2, String string) {
        this.a = pd2;
        super(string);
    }

    @Override
    public void run() {
        e e2 = pd.b(this.a);
        try {
            String string = new BigInteger(sv.a("", pd.a(this.a).O().getPublic(), pd.c(this.a))).toString(16);
            pd.a(this.a, pd.a(this.a).ay().a(new e(null, e2.b()), string));
            if (pd.b(this.a) != null) {
                pd.d().d("UUID of player {} is {}", pd.b(this.a).b(), pd.b(this.a).a());
                pd.a(this.a, cra.d);
            } else if (pd.a(this.a).R()) {
                pd.d().f("Failed to verify username but will let them in anyway!");
                pd.a(this.a, this.a.a(e2));
                pd.a(this.a, cra.d);
            } else {
                this.a.a("Failed to verify username!");
                pd.d().b("Username '{}' tried to join with an invalid session", e2.b());
            }
        }
        catch (b b2) {
            if (pd.a(this.a).R()) {
                pd.d().f("Authentication servers are down but will let them in anyway!");
                pd.a(this.a, this.a.a(e2));
                pd.a(this.a, cra.d);
            }
            this.a.a("Authentication servers are down. Please try again later, sorry!");
            pd.d().b("Couldn't verify username because servers are unavailable");
        }
    }
}

