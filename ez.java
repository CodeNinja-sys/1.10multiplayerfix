/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class ez
extends mn {
    @Override
    public String a() {
        return "blockdata";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.blockdata.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bvp bvp2;
        if (arrstring.length < 4) {
            throw new ben("commands.blockdata.usage", new Object[0]);
        }
        ala2.a(bnw.b, 0);
        cmz cmz2 = ez.a(ala2, arrstring, 0, false);
        iu iu2 = ala2.m_();
        if (!iu2.d(cmz2)) {
            throw new kx("commands.blockdata.outOfWorld", new Object[0]);
        }
        dbk dbk2 = iu2.n(cmz2);
        bql bql2 = iu2.q(cmz2);
        if (bql2 == null) {
            throw new kx("commands.blockdata.notValid", new Object[0]);
        }
        bvp bvp3 = bql2.b(new bvp());
        bvp bvp4 = bvp3.d();
        try {
            bvp2 = bdg.a(ez.a(ala2, arrstring, 3).i());
        }
        catch (aoo aoo2) {
            throw new kx("commands.blockdata.tagError", aoo2.getMessage());
        }
        bvp3.a(bvp2);
        bvp3.a("x", cmz2.a());
        bvp3.a("y", cmz2.b());
        bvp3.a("z", cmz2.c());
        if (bvp3.equals(bvp4)) {
            throw new kx("commands.blockdata.failed", bvp3.toString());
        }
        bql2.a(bvp3);
        bql2.c_();
        iu2.a(cmz2, dbk2, dbk2, 3);
        ala2.a(bnw.b, 1);
        ez.a(ala2, (fh)this, "commands.blockdata.success", bvp3.toString());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return ez.a(arrstring, 0, cmz2);
        }
        return Collections.emptyList();
    }
}

