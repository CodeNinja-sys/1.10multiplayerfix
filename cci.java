/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class cci
extends mn {
    @Override
    public String a() {
        return "summon";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.summon.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        iu iu2;
        if (arrstring.length < 1) {
            throw new ben("commands.summon.usage", new Object[0]);
        }
        String string = arrstring[0];
        cmz cmz2 = ala2.k_();
        amj amj2 = ala2.l_();
        double d2 = amj2.b;
        double d3 = amj2.c;
        double d4 = amj2.d;
        if (arrstring.length >= 4) {
            d2 = cci.b(d2, arrstring[1], true);
            d3 = cci.b(d3, arrstring[2], false);
            d4 = cci.b(d4, arrstring[3], true);
            cmz2 = new cmz(d2, d3, d4);
        }
        if (!(iu2 = ala2.m_()).d(cmz2)) {
            throw new kx("commands.summon.outOfWorld", new Object[0]);
        }
        if ("LightningBolt".equals(string)) {
            iu2.a(new tz(iu2, d2, d3, d4, false));
            cci.a(ala2, (fh)this, "commands.summon.success", new Object[0]);
            return;
        }
        bvp bvp2 = new bvp();
        boolean bl2 = false;
        if (arrstring.length >= 5) {
            object = cci.a(ala2, arrstring, 4);
            try {
                bvp2 = bdg.a(object.i());
                bl2 = true;
            }
            catch (aoo aoo2) {
                throw new kx("commands.summon.tagError", aoo2.getMessage());
            }
        }
        bvp2.a("id", string);
        object = aqz.a(bvp2, iu2, d2, d3, d4, true);
        if (object == null) {
            throw new kx("commands.summon.failed", new Object[0]);
        }
        ((cpk)object).a_(d2, d3, d4, ((cpk)object).ba, ((cpk)object).bb);
        if (!bl2 && object instanceof xy) {
            ((xy)object).a(iu2.C(new cmz((cpk)object)), null);
        }
        cci.a(ala2, (fh)this, "commands.summon.success", new Object[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return cci.a(arrstring, vb.b());
        }
        if (arrstring.length > 1 && arrstring.length <= 4) {
            return cci.a(arrstring, 1, cmz2);
        }
        return Collections.emptyList();
    }
}

