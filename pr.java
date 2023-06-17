/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.q.v;

public class pr
extends mn {
    @Override
    public String a() {
        return "time";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.time.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length > 1) {
            if ("set".equals(arrstring[0])) {
                int n2 = "day".equals(arrstring[1]) ? 1000 : ("night".equals(arrstring[1]) ? 13000 : pr.a(arrstring[1], 0));
                this.a(a2, n2);
                pr.a(ala2, (fh)this, "commands.time.set", n2);
                return;
            }
            if ("add".equals(arrstring[0])) {
                int n3 = pr.a(arrstring[1], 0);
                this.b(a2, n3);
                pr.a(ala2, (fh)this, "commands.time.added", n3);
                return;
            }
            if ("query".equals(arrstring[0])) {
                if ("daytime".equals(arrstring[1])) {
                    int n4 = (int)(ala2.m_().A() % 24000L);
                    ala2.a(bnw.e, n4);
                    pr.a(ala2, (fh)this, "commands.time.query", n4);
                    return;
                }
                if ("day".equals(arrstring[1])) {
                    int n5 = (int)(ala2.m_().A() / 24000L % Integer.MAX_VALUE);
                    ala2.a(bnw.e, n5);
                    pr.a(ala2, (fh)this, "commands.time.query", n5);
                    return;
                }
                if ("gametime".equals(arrstring[1])) {
                    int n6 = (int)(ala2.m_().z() % Integer.MAX_VALUE);
                    ala2.a(bnw.e, n6);
                    pr.a(ala2, (fh)this, "commands.time.query", n6);
                    return;
                }
            }
        }
        throw new ben("commands.time.usage", new Object[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return pr.a(arrstring, "set", "add", "query");
        }
        if (arrstring.length == 2 && "set".equals(arrstring[0])) {
            return pr.a(arrstring, "day", "night");
        }
        if (arrstring.length == 2 && "query".equals(arrstring[0])) {
            return pr.a(arrstring, "daytime", "gametime", "day");
        }
        return Collections.emptyList();
    }

    protected void a(a a2, int n2) {
        for (int i2 = 0; i2 < a2.d.length; ++i2) {
            ((iu)((Object)a2.d[i2])).b((long)n2);
        }
    }

    protected void b(a a2, int n2) {
        for (int i2 = 0; i2 < a2.d.length; ++i2) {
            v v2 = a2.d[i2];
            ((iu)((Object)v2)).b(((iu)((Object)v2)).A() + (long)n2);
        }
    }
}

