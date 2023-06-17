/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class wn
extends mn {
    @Override
    public String a() {
        return "gamerule";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.gamerule.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        xx xx2 = this.a(a2);
        String string = arrstring.length > 0 ? arrstring[0] : "";
        String string2 = arrstring.length > 1 ? wn.b(arrstring, 1) : "";
        switch (arrstring.length) {
            case 1: {
                if (xx2.d(string)) {
                    String string3 = xx2.a(string);
                    ala2.a(new aym(string).b(" = ").b(string3));
                    ala2.a(bnw.e, xx2.c(string));
                    break;
                }
                throw new kx("commands.gamerule.norule", string);
            }
            case 0: {
                ala2.a(new aym(wn.a(xx2.b())));
                break;
            }
            default: {
                if (xx2.a(string, ahu.b) && !"true".equals(string2) && !"false".equals(string2)) {
                    throw new kx("commands.generic.boolean.invalid", string2);
                }
                xx2.a(string, string2);
                wn.a(xx2, string, a2);
                wn.a(ala2, (fh)this, "commands.gamerule.success", string, string2);
            }
        }
    }

    public static void a(xx xx2, String string, a a2) {
        if ("reducedDebugInfo".equals(string)) {
            byte by2 = xx2.b(string) ? (byte)22 : 23;
            for (czt czt2 : ((cmt)((Object)a2.al())).u()) {
                czt2.a.a(new buk(czt2, by2));
            }
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        xx xx2;
        if (arrstring.length == 1) {
            return wn.a(arrstring, this.a(a2).b());
        }
        if (arrstring.length == 2 && (xx2 = this.a(a2)).a(arrstring[0], ahu.b)) {
            return wn.a(arrstring, "true", "false");
        }
        return Collections.emptyList();
    }

    private xx a(a a2) {
        return ((iu)((Object)a2.a(0))).F();
    }
}

