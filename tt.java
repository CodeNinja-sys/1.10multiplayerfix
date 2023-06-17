/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class tt {
    private static final d a = org.apache.logging.log4j.c.c();
    private final alj b;
    private final Set c = aad.a();
    private final cyn d = new cyn();
    private int e;

    public tt(alj alj2) {
        this.b = alj2;
        this.e = ((cmt)((Object)alj2.f().al())).d();
    }

    public static long a(double d2) {
        return cmk.d(d2 * 4096.0);
    }

    public static void a(cpk cpk2, double d2, double d3, double d4) {
        cpk2.bK = tt.a(d2);
        cpk2.bL = tt.a(d3);
        cpk2.bM = tt.a(d4);
    }

    public void a(cpk cpk2) {
        if (cpk2 instanceof czt) {
            this.a(cpk2, 512, 2);
            czt czt2 = (czt)cpk2;
            for (arn arn2 : this.c) {
                if (arn2.b() == czt2) continue;
                arn2.b(czt2);
            }
        } else if (cpk2 instanceof cvo) {
            this.a(cpk2, 64, 5, true);
        } else if (cpk2 instanceof cwt) {
            this.a(cpk2, 64, 20, false);
        } else if (cpk2 instanceof bx) {
            this.a(cpk2, 64, 10, false);
        } else if (cpk2 instanceof chw) {
            this.a(cpk2, 64, 10, false);
        } else if (cpk2 instanceof bef) {
            this.a(cpk2, 64, 10, true);
        } else if (cpk2 instanceof ddg) {
            this.a(cpk2, 64, 10, true);
        } else if (cpk2 instanceof cnd) {
            this.a(cpk2, 64, 4, true);
        } else if (cpk2 instanceof xe) {
            this.a(cpk2, 64, 10, true);
        } else if (cpk2 instanceof tp) {
            this.a(cpk2, 64, 10, true);
        } else if (cpk2 instanceof bgc) {
            this.a(cpk2, 64, 10, true);
        } else if (cpk2 instanceof p) {
            this.a(cpk2, 64, 10, true);
        } else if (cpk2 instanceof er) {
            this.a(cpk2, 64, 20, true);
        } else if (cpk2 instanceof cef) {
            this.a(cpk2, 80, 3, true);
        } else if (cpk2 instanceof cor) {
            this.a(cpk2, 80, 3, true);
        } else if (cpk2 instanceof aqc) {
            this.a(cpk2, 64, 3, true);
        } else if (cpk2 instanceof dga) {
            this.a(cpk2, 80, 3, false);
        } else if (cpk2 instanceof dcg) {
            this.a(cpk2, 80, 3, true);
        } else if (cpk2 instanceof azc) {
            this.a(cpk2, 80, 3, false);
        } else if (cpk2 instanceof brd) {
            this.a(cpk2, 160, 3, true);
        } else if (cpk2 instanceof cjl) {
            this.a(cpk2, 80, 3, true);
        } else if (cpk2 instanceof cgg) {
            this.a(cpk2, 160, 10, true);
        } else if (cpk2 instanceof azb) {
            this.a(cpk2, 160, 20, true);
        } else if (cpk2 instanceof gj) {
            this.a(cpk2, 160, Integer.MAX_VALUE, false);
        } else if (cpk2 instanceof bdi) {
            this.a(cpk2, 160, 3, true);
        } else if (cpk2 instanceof cvs) {
            this.a(cpk2, 160, 20, true);
        } else if (cpk2 instanceof gw) {
            this.a(cpk2, 160, Integer.MAX_VALUE, true);
        } else if (cpk2 instanceof abi) {
            this.a(cpk2, 256, Integer.MAX_VALUE, false);
        }
    }

    public void a(cpk cpk2, int n2, int n3) {
        this.a(cpk2, n2, n3, false);
    }

    public void a(cpk cpk2, int n2, int n3, boolean bl2) {
        try {
            if (this.d.b(cpk2.bW())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            arn arn2 = new arn(cpk2, n2, this.e, n3, bl2);
            this.c.add(arn2);
            this.d.a(cpk2.bW(), arn2);
            arn2.b(this.b.g);
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Adding entity to track");
            sx sx2 = cet2.a("Entity To Track");
            sx2.a("Tracking range", n2 + " blocks");
            sx2.a("Update interval", new cfb(this, n3));
            cpk2.a(sx2);
            ((arn)this.d.a(cpk2.bW())).b().a(cet2.a("Entity That Is Already Tracked"));
            try {
                throw new oz(cet2);
            }
            catch (oz oz2) {
                a.b("\"Silently\" catching entity tracking error.", (Throwable)oz2);
            }
        }
    }

    public void b(cpk cpk2) {
        Object object;
        if (cpk2 instanceof czt) {
            object = (czt)cpk2;
            for (arn arn2 : this.c) {
                arn2.a((czt)object);
            }
        }
        if ((object = (arn)this.d.d(cpk2.bW())) != null) {
            this.c.remove(object);
            ((arn)object).a();
        }
    }

    public void a() {
        ArrayList arrayList = ov.a();
        for (Object object : this.c) {
            Object object2;
            ((arn)object).a(this.b.g);
            if (!((arn)object).b || !((object2 = ((arn)object).b()) instanceof czt)) continue;
            arrayList.add((czt)object2);
        }
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            Object object;
            object = (czt)arrayList.get(i2);
            for (arn arn2 : this.c) {
                if (arn2.b() == object) continue;
                arn2.b((czt)object);
            }
        }
    }

    public void a(czt czt2) {
        for (arn arn2 : this.c) {
            if (arn2.b() == czt2) {
                arn2.b(this.b.g);
                continue;
            }
            arn2.b(czt2);
        }
    }

    public void a(cpk cpk2, ds ds2) {
        arn arn2 = (arn)this.d.a(cpk2.bW());
        if (arn2 != null) {
            arn2.a(ds2);
        }
    }

    public void b(cpk cpk2, ds ds2) {
        arn arn2 = (arn)this.d.a(cpk2.bW());
        if (arn2 != null) {
            arn2.b(ds2);
        }
    }

    public void b(czt czt2) {
        for (arn arn2 : this.c) {
            arn2.d(czt2);
        }
    }

    public void a(czt czt2, bhm bhm2) {
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        for (Object object : this.c) {
            cpk cpk2 = ((arn)object).b();
            if (cpk2 == czt2 || cpk2.bH != bhm2.b || cpk2.bJ != bhm2.c) continue;
            ((arn)object).b(czt2);
            if (cpk2 instanceof xy && ((xy)cpk2).aH() != null) {
                arrayList.add(cpk2);
            }
            if (cpk2.cH().isEmpty()) continue;
            arrayList2.add(cpk2);
        }
        if (!arrayList.isEmpty()) {
            for (Object object : arrayList) {
                czt2.a.a(new bsc((cpk)object, ((xy)object).aH()));
            }
        }
        if (!arrayList2.isEmpty()) {
            for (Object object : arrayList2) {
                czt2.a.a(new pg((cpk)object));
            }
        }
    }

    public void a(int n2) {
        this.e = (n2 - 1) * 16;
        for (arn arn2 : this.c) {
            arn2.a(this.e);
        }
    }
}

