/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;

public class crx
implements akc {
    @Override
    public int a() {
        return 165;
    }

    @Override
    public bvp a(bvp bvp2) {
        bvp bvp3;
        if ("minecraft:written_book".equals(bvp2.l("id")) && (bvp3 = bvp2.o("tag")).b("pages", 9)) {
            bmh bmh2 = bvp3.c("pages", 8);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                String string = bmh2.g(i2);
                cbg cbg2 = null;
                if ("null".equals(string) || aco.b(string)) {
                    cbg2 = new aym("");
                } else if (string.charAt(0) == '\"' && string.charAt(string.length() - 1) == '\"' || string.charAt(0) == '{' && string.charAt(string.length() - 1) == '}') {
                    try {
                        cbg2 = (cbg)by.a.a(string, cbg.class);
                        if (cbg2 == null) {
                            cbg2 = new aym("");
                        }
                    }
                    catch (aa aa2) {
                        // empty catch block
                    }
                    if (cbg2 == null) {
                        try {
                            cbg2 = zf.a(string);
                        }
                        catch (aa aa3) {
                            // empty catch block
                        }
                    }
                    if (cbg2 == null) {
                        try {
                            cbg2 = zf.b(string);
                        }
                        catch (aa aa4) {
                            // empty catch block
                        }
                    }
                    if (cbg2 == null) {
                        cbg2 = new aym(string);
                    }
                } else {
                    cbg2 = new aym(string);
                }
                bmh2.a(i2, new byh(zf.a(cbg2)));
            }
            bvp3.a("pages", bmh2);
        }
        return bvp2;
    }
}

