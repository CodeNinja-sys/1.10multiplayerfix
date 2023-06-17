/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class pe
extends mn {
    @Override
    public String a() {
        return "enchant";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.enchant.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bmh bmh2;
        dad dad2;
        if (arrstring.length < 2) {
            throw new ben("commands.enchant.usage", new Object[0]);
        }
        bga bga2 = (bga)pe.a(a2, ala2, arrstring[0], bga.class);
        ala2.a(bnw.d, 0);
        try {
            dad2 = dad.c(pe.a(arrstring[1], 0));
        }
        catch (cml cml2) {
            dad2 = dad.a(arrstring[1]);
        }
        if (dad2 == null) {
            throw new cml("commands.enchant.notFound", dad.b(dad2));
        }
        int n2 = 1;
        bhl bhl2 = bga2.bt();
        if (bhl2 == null) {
            throw new kx("commands.enchant.noItem", new Object[0]);
        }
        if (!dad2.a(bhl2)) {
            throw new kx("commands.enchant.cantEnchant", new Object[0]);
        }
        if (arrstring.length >= 3) {
            n2 = pe.a(arrstring[2], dad2.e(), dad2.a());
        }
        if (bhl2.n() && (bmh2 = bhl2.p()) != null) {
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                dad dad3;
                short s2 = bmh2.b(i2).g("id");
                if (dad.c(s2) == null || dad2.a(dad3 = dad.c(s2))) continue;
                throw new kx("commands.enchant.cantCombine", dad2.d(n2), dad3.d(bmh2.b(i2).g("lvl")));
            }
        }
        bhl2.a(dad2, n2);
        pe.a(ala2, (fh)this, "commands.enchant.success", new Object[0]);
        ala2.a(bnw.d, 1);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return pe.a(arrstring, a2.J());
        }
        if (arrstring.length == 2) {
            return pe.a(arrstring, dad.b.c());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

