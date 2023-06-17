/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import com.a.b.k;
import com.a.b.r;
import java.lang.reflect.Type;

public class by
implements akc {
    public static final k a = new r().a((Type)((Object)cbg.class), (Object)new czl()).i();

    @Override
    public int a() {
        return 101;
    }

    @Override
    public bvp a(bvp bvp2) {
        if ("Sign".equals(bvp2.l("id"))) {
            this.a(bvp2, "Text1");
            this.a(bvp2, "Text2");
            this.a(bvp2, "Text3");
            this.a(bvp2, "Text4");
        }
        return bvp2;
    }

    private void a(bvp bvp2, String string) {
        String string2 = bvp2.l(string);
        cbg cbg2 = null;
        if ("null".equals(string2) || aco.b(string2)) {
            cbg2 = new aym("");
        } else if (string2.charAt(0) == '\"' && string2.charAt(string2.length() - 1) == '\"' || string2.charAt(0) == '{' && string2.charAt(string2.length() - 1) == '}') {
            try {
                cbg2 = (cbg)a.a(string2, cbg.class);
                if (cbg2 == null) {
                    cbg2 = new aym("");
                }
            }
            catch (aa aa2) {
                // empty catch block
            }
            if (cbg2 == null) {
                try {
                    cbg2 = zf.a(string2);
                }
                catch (aa aa3) {
                    // empty catch block
                }
            }
            if (cbg2 == null) {
                try {
                    cbg2 = zf.b(string2);
                }
                catch (aa aa4) {
                    // empty catch block
                }
            }
            if (cbg2 == null) {
                cbg2 = new aym(string2);
            }
        } else {
            cbg2 = new aym(string2);
        }
        bvp2.a(string, zf.a(cbg2));
    }
}

