/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.c.a;

public class ma
extends mn {
    private static final Map a;

    @Override
    public String a() {
        return "replaceitem";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.replaceitem.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        azg azg2;
        int n2;
        boolean bl2;
        if (arrstring.length < 1) {
            throw new ben("commands.replaceitem.usage", new Object[0]);
        }
        if ("entity".equals(arrstring[0])) {
            bl2 = false;
        } else if ("block".equals(arrstring[0])) {
            bl2 = true;
        } else {
            throw new ben("commands.replaceitem.usage", new Object[0]);
        }
        if (bl2) {
            if (arrstring.length < 6) {
                throw new ben("commands.replaceitem.block.usage", new Object[0]);
            }
            n2 = 4;
        } else {
            if (arrstring.length < 4) {
                throw new ben("commands.replaceitem.entity.usage", new Object[0]);
            }
            n2 = 2;
        }
        String string = arrstring[n2];
        int n3 = this.e(arrstring[n2++]);
        try {
            azg2 = ma.a(ala2, arrstring[n2]);
        }
        catch (cml cml2) {
            if (bfa.a(arrstring[n2]) == blg.a) {
                azg2 = null;
            }
            throw cml2;
        }
        int n4 = arrstring.length > ++n2 ? ma.a(arrstring[n2++], 1, 64) : 1;
        int n5 = arrstring.length > n2 ? ma.a(arrstring[n2++]) : 0;
        bhl bhl2 = new bhl(azg2, n4, n5);
        if (arrstring.length > n2) {
            object = ma.a(ala2, arrstring, n2).i();
            try {
                bhl2.d(bdg.a((String)object));
            }
            catch (aoo aoo2) {
                throw new kx("commands.replaceitem.tagError", aoo2.getMessage());
            }
        }
        if (bhl2.a() == null) {
            bhl2 = null;
        }
        if (bl2) {
            ala2.a(bnw.d, 0);
            object = ma.a(ala2, arrstring, 1, false);
            iu iu2 = ala2.m_();
            bql bql2 = iu2.q((cmz)object);
            if (bql2 == null || !(bql2 instanceof tb)) {
                throw new kx("commands.replaceitem.noContainer", ((cjx)object).a(), ((cjx)object).b(), ((cjx)object).c());
            }
            tb tb2 = (tb)((Object)bql2);
            if (n3 >= 0 && n3 < tb2.aI_()) {
                tb2.a(n3, bhl2);
            }
        } else {
            object = ma.b(a2, ala2, arrstring[1]);
            ala2.a(bnw.d, 0);
            if (object instanceof bdl) {
                ((bdl)object).o.a();
            }
            if (!((cpk)object).a_(n3, bhl2)) {
                throw new kx("commands.replaceitem.failed", string, n4, bhl2 == null ? "Air" : bhl2.B());
            }
            if (object instanceof bdl) {
                ((bdl)object).o.a();
            }
        }
        ala2.a(bnw.d, n4);
        ma.a(ala2, (fh)this, "commands.replaceitem.success", string, n4, bhl2 == null ? "Air" : bhl2.B());
    }

    private int e(String string) {
        if (!a.containsKey(string)) {
            throw new kx("commands.generic.parameter.invalid", string);
        }
        return (Integer)a.get(string);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return ma.a(arrstring, "entity", "block");
        }
        if (arrstring.length == 2 && "entity".equals(arrstring[0])) {
            return ma.a(arrstring, a2.J());
        }
        if (arrstring.length >= 2 && arrstring.length <= 4 && "block".equals(arrstring[0])) {
            return ma.a(arrstring, 1, cmz2);
        }
        if (arrstring.length == 3 && "entity".equals(arrstring[0]) || arrstring.length == 5 && "block".equals(arrstring[0])) {
            return ma.a(arrstring, a.keySet());
        }
        if (arrstring.length == 4 && "entity".equals(arrstring[0]) || arrstring.length == 6 && "block".equals(arrstring[0])) {
            return ma.a(arrstring, azg.g.c());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return arrstring.length > 0 && "entity".equals(arrstring[0]) && n2 == 1;
    }

    static {
        int n2;
        a = sz.c();
        for (n2 = 0; n2 < 54; ++n2) {
            a.put("slot.container." + n2, n2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            a.put("slot.hotbar." + n2, n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            a.put("slot.inventory." + n2, 9 + n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            a.put("slot.enderchest." + n2, 200 + n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            a.put("slot.villager." + n2, 300 + n2);
        }
        for (n2 = 0; n2 < 15; ++n2) {
            a.put("slot.horse." + n2, 500 + n2);
        }
        a.put("slot.weapon", 98);
        a.put("slot.weapon.mainhand", 98);
        a.put("slot.weapon.offhand", 99);
        a.put("slot.armor.head", 100 + dfm.f.b());
        a.put("slot.armor.chest", 100 + dfm.e.b());
        a.put("slot.armor.legs", 100 + dfm.d.b());
        a.put("slot.armor.feet", 100 + dfm.c.b());
        a.put("slot.horse.saddle", 400);
        a.put("slot.horse.armor", 401);
        a.put("slot.horse.chest", 499);
    }
}

