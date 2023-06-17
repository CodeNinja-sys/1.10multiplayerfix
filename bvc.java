/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bvc
extends mn {
    @Override
    public String a() {
        return "playsound";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.playsound.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        String string;
        csg csg2;
        if (arrstring.length < 2) {
            throw new ben(this.a(ala2), new Object[0]);
        }
        int n2 = 0;
        String string2 = arrstring[n2++];
        if ((csg2 = csg.a(string = arrstring[n2++])) == null) {
            throw new kx("commands.playsound.unknownSoundSource", string);
        }
        czt czt2 = bvc.a(a2, ala2, arrstring[n2++]);
        amj amj2 = ala2.l_();
        double d2 = amj2.b;
        if (arrstring.length > n2) {
            d2 = bvc.b(d2, arrstring[n2++], true);
        }
        double d3 = amj2.c;
        if (arrstring.length > n2) {
            d3 = bvc.b(d3, arrstring[n2++], 0, 0, false);
        }
        double d4 = amj2.d;
        if (arrstring.length > n2) {
            d4 = bvc.b(d4, arrstring[n2++], true);
        }
        double d5 = 1.0;
        if (arrstring.length > n2) {
            d5 = bvc.a(arrstring[n2++], 0.0, 3.4028234663852886E38);
        }
        double d6 = 1.0;
        if (arrstring.length > n2) {
            d6 = bvc.a(arrstring[n2++], 0.0, 2.0);
        }
        double d7 = 0.0;
        if (arrstring.length > n2) {
            d7 = bvc.a(arrstring[n2], 0.0, 1.0);
        }
        double d8 = d5 > 1.0 ? d5 * 16.0 : 16.0;
        double d9 = czt2.j(d2, d3, d4);
        if (d9 > d8) {
            if (d7 <= 0.0) {
                throw new kx("commands.playsound.playerTooFar", czt2.i_());
            }
            double d10 = d2 - czt2.aU;
            double d11 = d3 - czt2.aV;
            double d12 = d4 - czt2.aW;
            double d13 = Math.sqrt(d10 * d10 + d11 * d11 + d12 * d12);
            if (d13 > 0.0) {
                d2 = czt2.aU + d10 / d13 * 2.0;
                d3 = czt2.aV + d11 / d13 * 2.0;
                d4 = czt2.aW + d12 / d13 * 2.0;
            }
            d5 = d7;
        }
        czt2.a.a(new cme(string2, csg2, d2, d3, d4, (float)d5, (float)d6));
        bvc.a(ala2, (fh)this, "commands.playsound.success", string2, czt2.i_());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return bvc.a(arrstring, bi.a.c());
        }
        if (arrstring.length == 2) {
            return bvc.a(arrstring, csg.b());
        }
        if (arrstring.length == 3) {
            return bvc.a(arrstring, a2.J());
        }
        if (arrstring.length > 3 && arrstring.length <= 6) {
            return bvc.a(arrstring, 3, cmz2);
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 2;
    }
}

