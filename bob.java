/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bob
extends mn {
    @Override
    public String a() {
        return "worldborder";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.worldborder.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 1) {
            throw new ben("commands.worldborder.usage", new Object[0]);
        }
        ajw ajw2 = this.a(a2);
        if ("set".equals(arrstring[0])) {
            long l2;
            if (arrstring.length != 2 && arrstring.length != 3) {
                throw new ben("commands.worldborder.set.usage", new Object[0]);
            }
            double d2 = ajw2.j();
            double d3 = bob.a(arrstring[1], 1.0, 6.0E7);
            long l3 = l2 = arrstring.length > 2 ? bob.a(arrstring[2], 0L, 9223372036854775L) * 1000L : 0L;
            if (l2 > 0L) {
                ajw2.a(d2, d3, l2);
                if (d2 > d3) {
                    bob.a(ala2, (fh)this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", d3), String.format("%.1f", d2), Long.toString(l2 / 1000L));
                } else {
                    bob.a(ala2, (fh)this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", d3), String.format("%.1f", d2), Long.toString(l2 / 1000L));
                }
            } else {
                ajw2.a(d3);
                bob.a(ala2, (fh)this, "commands.worldborder.set.success", String.format("%.1f", d3), String.format("%.1f", d2));
            }
        } else if ("add".equals(arrstring[0])) {
            if (arrstring.length != 2 && arrstring.length != 3) {
                throw new ben("commands.worldborder.add.usage", new Object[0]);
            }
            double d4 = ajw2.h();
            double d5 = d4 + bob.a(arrstring[1], -d4, 6.0E7 - d4);
            long l4 = ajw2.i() + (arrstring.length > 2 ? bob.a(arrstring[2], 0L, 9223372036854775L) * 1000L : 0L);
            if (l4 > 0L) {
                ajw2.a(d4, d5, l4);
                if (d4 > d5) {
                    bob.a(ala2, (fh)this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", d5), String.format("%.1f", d4), Long.toString(l4 / 1000L));
                } else {
                    bob.a(ala2, (fh)this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", d5), String.format("%.1f", d4), Long.toString(l4 / 1000L));
                }
            } else {
                ajw2.a(d5);
                bob.a(ala2, (fh)this, "commands.worldborder.set.success", String.format("%.1f", d5), String.format("%.1f", d4));
            }
        } else if ("center".equals(arrstring[0])) {
            if (arrstring.length != 3) {
                throw new ben("commands.worldborder.center.usage", new Object[0]);
            }
            cmz cmz2 = ala2.k_();
            double d6 = bob.b((double)cmz2.a() + 0.5, arrstring[1], true);
            double d7 = bob.b((double)cmz2.c() + 0.5, arrstring[2], true);
            ajw2.b(d6, d7);
            bob.a(ala2, (fh)this, "commands.worldborder.center.success", d6, d7);
        } else if ("damage".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ben("commands.worldborder.damage.usage", new Object[0]);
            }
            if ("buffer".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ben("commands.worldborder.damage.buffer.usage", new Object[0]);
                }
                double d8 = bob.a(arrstring[2], 0.0);
                double d9 = ajw2.m();
                ajw2.b(d8);
                bob.a(ala2, (fh)this, "commands.worldborder.damage.buffer.success", String.format("%.1f", d8), String.format("%.1f", d9));
            } else if ("amount".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ben("commands.worldborder.damage.amount.usage", new Object[0]);
                }
                double d10 = bob.a(arrstring[2], 0.0);
                double d11 = ajw2.n();
                ajw2.c(d10);
                bob.a(ala2, (fh)this, "commands.worldborder.damage.amount.success", String.format("%.2f", d10), String.format("%.2f", d11));
            }
        } else if ("warning".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ben("commands.worldborder.warning.usage", new Object[0]);
            }
            if ("time".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ben("commands.worldborder.warning.time.usage", new Object[0]);
                }
                int n2 = bob.a(arrstring[2], 0);
                int n3 = ajw2.p();
                ajw2.b(n2);
                bob.a(ala2, (fh)this, "commands.worldborder.warning.time.success", n2, n3);
            } else if ("distance".equals(arrstring[1])) {
                if (arrstring.length != 3) {
                    throw new ben("commands.worldborder.warning.distance.usage", new Object[0]);
                }
                int n4 = bob.a(arrstring[2], 0);
                int n5 = ajw2.q();
                ajw2.c(n4);
                bob.a(ala2, (fh)this, "commands.worldborder.warning.distance.success", n4, n5);
            }
        } else if ("get".equals(arrstring[0])) {
            double d12 = ajw2.h();
            ala2.a(bnw.e, cmk.c(d12 + 0.5));
            ala2.a(new du("commands.worldborder.get.success", String.format("%.0f", d12)));
        } else {
            throw new ben("commands.worldborder.usage", new Object[0]);
        }
    }

    protected ajw a(a a2) {
        return ((iu)((Object)a2.d[0])).U();
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return bob.a(arrstring, "set", "center", "damage", "warning", "add", "get");
        }
        if (arrstring.length == 2 && "damage".equals(arrstring[0])) {
            return bob.a(arrstring, "buffer", "amount");
        }
        if (arrstring.length >= 2 && arrstring.length <= 3 && "center".equals(arrstring[0])) {
            return bob.b(arrstring, 1, cmz2);
        }
        if (arrstring.length == 2 && "warning".equals(arrstring[0])) {
            return bob.a(arrstring, "time", "distance");
        }
        return Collections.emptyList();
    }
}

