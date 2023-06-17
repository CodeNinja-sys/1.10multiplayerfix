/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.b.cg;
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.b.dg;
import com.a.a.d.mq;
import java.util.List;

public class cgc
implements baa {
    private static final dg c = dg.a('|').a();
    private final String d;
    private final String e;

    public cgc(String string, String string2) {
        this.d = string;
        this.e = string2;
    }

    @Override
    public cm a(bkp bkp2) {
        List list;
        boolean bl2;
        bvs bvs2 = bkp2.a(this.d);
        if (bvs2 == null) {
            throw new RuntimeException(this.toString() + ": Definition: " + bkp2 + " has no property: " + this.d);
        }
        String string = this.e;
        boolean bl3 = bl2 = !string.isEmpty() && string.charAt(0) == '!';
        if (bl2) {
            string = string.substring(1);
        }
        if ((list = c.b(string)).isEmpty()) {
            throw new RuntimeException(this.toString() + ": has an empty value: " + this.e);
        }
        cm cm2 = list.size() == 1 ? this.a(bvs2, string) : cn.b(mq.a((Iterable)list, new hc(this, bvs2)));
        return bl2 ? cn.a(cm2) : cm2;
    }

    private cm a(bvs bvs2, String string) {
        cg cg2 = bvs2.a(string);
        if (!cg2.b()) {
            throw new RuntimeException(this.toString() + ": has an unknown value: " + this.e);
        }
        return new chj(this, bvs2, cg2);
    }

    public String toString() {
        return cc.a((Object)this).a("key", this.d).a("value", this.e).toString();
    }

    static /* synthetic */ cm a(cgc cgc2, bvs bvs2, String string) {
        return cgc2.a(bvs2, string);
    }
}

