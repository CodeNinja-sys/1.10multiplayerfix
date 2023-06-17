/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bpe
extends mn {
    @Override
    public String a() {
        return "particle";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.particle.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 8) {
            throw new ben("commands.particle.usage", new Object[0]);
        }
        boolean bl2 = false;
        lz lz2 = lz.a(arrstring[0]);
        if (lz2 == null) {
            throw new kx("commands.particle.notFound", arrstring[0]);
        }
        String string = arrstring[0];
        amj amj2 = ala2.l_();
        double d2 = (float)bpe.b(amj2.b, arrstring[1], true);
        double d3 = (float)bpe.b(amj2.c, arrstring[2], true);
        double d4 = (float)bpe.b(amj2.d, arrstring[3], true);
        double d5 = (float)bpe.c(arrstring[4]);
        double d6 = (float)bpe.c(arrstring[5]);
        double d7 = (float)bpe.c(arrstring[6]);
        double d8 = (float)bpe.c(arrstring[7]);
        int n2 = 0;
        if (arrstring.length > 8) {
            n2 = bpe.a(arrstring[8], 0);
        }
        boolean bl3 = false;
        if (arrstring.length > 9 && "force".equals(arrstring[9])) {
            bl3 = true;
        }
        czt czt2 = arrstring.length > 10 ? bpe.a(a2, ala2, arrstring[10]) : null;
        int[] arrn = new int[lz2.d()];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (arrstring.length <= 11 + i2) continue;
            try {
                arrn[i2] = Integer.parseInt(arrstring[11 + i2]);
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                throw new kx("commands.particle.invalidParam", arrstring[11 + i2]);
            }
        }
        iu iu2 = ala2.m_();
        if (iu2 instanceof alj) {
            alj alj2 = (alj)iu2;
            if (czt2 == null) {
                alj2.a(lz2, bl3, d2, d3, d4, n2, d5, d6, d7, d8, arrn);
            } else {
                alj2.a(czt2, lz2, bl3, d2, d3, d4, n2, d5, d6, d7, d8, arrn);
            }
            bpe.a(ala2, (fh)this, "commands.particle.success", string, Math.max(n2, 1));
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return bpe.a(arrstring, lz.a());
        }
        if (arrstring.length > 1 && arrstring.length <= 4) {
            return bpe.a(arrstring, 1, cmz2);
        }
        if (arrstring.length == 10) {
            return bpe.a(arrstring, "normal", "force");
        }
        if (arrstring.length == 11) {
            return bpe.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 10;
    }
}

