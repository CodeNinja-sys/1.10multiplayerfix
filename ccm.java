/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class ccm
extends mn {
    @Override
    public String a() {
        return "effect";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.effect.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bfv bfv2;
        if (arrstring.length < 2) {
            throw new ben("commands.effect.usage", new Object[0]);
        }
        bga bga2 = (bga)ccm.a(a2, ala2, arrstring[0], bga.class);
        if ("clear".equals(arrstring[1])) {
            if (bga2.bf().isEmpty()) {
                throw new kx("commands.effect.failure.notActive.all", bga2.i_());
            }
            bga2.be();
            ccm.a(ala2, (fh)this, "commands.effect.success.removed.all", bga2.i_());
            return;
        }
        try {
            bfv2 = bfv.a(ccm.a(arrstring[1], 1));
        }
        catch (cml cml2) {
            bfv2 = bfv.a(arrstring[1]);
        }
        if (bfv2 == null) {
            throw new cml("commands.effect.notFound", arrstring[1]);
        }
        int n2 = 600;
        int n3 = 30;
        int n4 = 0;
        if (arrstring.length >= 3) {
            n3 = ccm.a(arrstring[2], 0, 1000000);
            n2 = bfv2.a() ? n3 : n3 * 20;
        } else if (bfv2.a()) {
            n2 = 1;
        }
        if (arrstring.length >= 4) {
            n4 = ccm.a(arrstring[3], 0, 255);
        }
        boolean bl2 = true;
        if (arrstring.length >= 5 && "true".equalsIgnoreCase(arrstring[4])) {
            bl2 = false;
        }
        if (n3 > 0) {
            cko cko2 = new cko(bfv2, n2, n4, false, bl2);
            bga2.b(cko2);
            ccm.a(ala2, (fh)this, "commands.effect.success", new du(cko2.f(), new Object[0]), bfv.a(bfv2), n4, bga2.i_(), n3);
            return;
        }
        if (!bga2.b(bfv2)) {
            throw new kx("commands.effect.failure.notActive", new du(bfv2.b(), new Object[0]), bga2.i_());
        }
        bga2.d(bfv2);
        ccm.a(ala2, (fh)this, "commands.effect.success.removed", new du(bfv2.b(), new Object[0]), bga2.i_());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return ccm.a(arrstring, a2.J());
        }
        if (arrstring.length == 2) {
            return ccm.a(arrstring, bfv.a.c());
        }
        if (arrstring.length == 5) {
            return ccm.a(arrstring, "true", "false");
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

