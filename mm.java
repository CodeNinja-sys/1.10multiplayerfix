/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class mm
extends mn {
    @Override
    public String a() {
        return "testfor";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.testfor.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bvp bvp2;
        if (arrstring.length < 1) {
            throw new ben("commands.testfor.usage", new Object[0]);
        }
        cpk cpk2 = mm.b(a2, ala2, arrstring[0]);
        bvp bvp3 = null;
        if (arrstring.length >= 2) {
            try {
                bvp3 = bdg.a(mm.b(arrstring, 1));
            }
            catch (aoo aoo2) {
                throw new kx("commands.testfor.tagError", aoo2.getMessage());
            }
        }
        if (bvp3 != null && !ayj.a(bvp3, bvp2 = mm.a(cpk2), true)) {
            throw new kx("commands.testfor.failure", cpk2.i_());
        }
        mm.a(ala2, (fh)this, "commands.testfor.success", cpk2.i_());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return mm.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }
}

