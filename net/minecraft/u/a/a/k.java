/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.u.a.g;

public class k
implements g {
    private static final String[] a = new String[128];

    static {
        k.a[0] = "minecraft:water";
        k.a[1] = "minecraft:regeneration";
        k.a[2] = "minecraft:swiftness";
        k.a[3] = "minecraft:fire_resistance";
        k.a[4] = "minecraft:poison";
        k.a[5] = "minecraft:healing";
        k.a[6] = "minecraft:night_vision";
        k.a[7] = null;
        k.a[8] = "minecraft:weakness";
        k.a[9] = "minecraft:strength";
        k.a[10] = "minecraft:slowness";
        k.a[11] = "minecraft:leaping";
        k.a[12] = "minecraft:harming";
        k.a[13] = "minecraft:water_breathing";
        k.a[14] = "minecraft:invisibility";
        k.a[15] = null;
        k.a[16] = "minecraft:awkward";
        k.a[17] = "minecraft:regeneration";
        k.a[18] = "minecraft:swiftness";
        k.a[19] = "minecraft:fire_resistance";
        k.a[20] = "minecraft:poison";
        k.a[21] = "minecraft:healing";
        k.a[22] = "minecraft:night_vision";
        k.a[23] = null;
        k.a[24] = "minecraft:weakness";
        k.a[25] = "minecraft:strength";
        k.a[26] = "minecraft:slowness";
        k.a[27] = "minecraft:leaping";
        k.a[28] = "minecraft:harming";
        k.a[29] = "minecraft:water_breathing";
        k.a[30] = "minecraft:invisibility";
        k.a[31] = null;
        k.a[32] = "minecraft:thick";
        k.a[33] = "minecraft:strong_regeneration";
        k.a[34] = "minecraft:strong_swiftness";
        k.a[35] = "minecraft:fire_resistance";
        k.a[36] = "minecraft:strong_poison";
        k.a[37] = "minecraft:strong_healing";
        k.a[38] = "minecraft:night_vision";
        k.a[39] = null;
        k.a[40] = "minecraft:weakness";
        k.a[41] = "minecraft:strong_strength";
        k.a[42] = "minecraft:slowness";
        k.a[43] = "minecraft:strong_leaping";
        k.a[44] = "minecraft:strong_harming";
        k.a[45] = "minecraft:water_breathing";
        k.a[46] = "minecraft:invisibility";
        k.a[47] = null;
        k.a[48] = null;
        k.a[49] = "minecraft:strong_regeneration";
        k.a[50] = "minecraft:strong_swiftness";
        k.a[51] = "minecraft:fire_resistance";
        k.a[52] = "minecraft:strong_poison";
        k.a[53] = "minecraft:strong_healing";
        k.a[54] = "minecraft:night_vision";
        k.a[55] = null;
        k.a[56] = "minecraft:weakness";
        k.a[57] = "minecraft:strong_strength";
        k.a[58] = "minecraft:slowness";
        k.a[59] = "minecraft:strong_leaping";
        k.a[60] = "minecraft:strong_harming";
        k.a[61] = "minecraft:water_breathing";
        k.a[62] = "minecraft:invisibility";
        k.a[63] = null;
        k.a[64] = "minecraft:mundane";
        k.a[65] = "minecraft:long_regeneration";
        k.a[66] = "minecraft:long_swiftness";
        k.a[67] = "minecraft:long_fire_resistance";
        k.a[68] = "minecraft:long_poison";
        k.a[69] = "minecraft:healing";
        k.a[70] = "minecraft:long_night_vision";
        k.a[71] = null;
        k.a[72] = "minecraft:long_weakness";
        k.a[73] = "minecraft:long_strength";
        k.a[74] = "minecraft:long_slowness";
        k.a[75] = "minecraft:long_leaping";
        k.a[76] = "minecraft:harming";
        k.a[77] = "minecraft:long_water_breathing";
        k.a[78] = "minecraft:long_invisibility";
        k.a[79] = null;
        k.a[80] = "minecraft:awkward";
        k.a[81] = "minecraft:long_regeneration";
        k.a[82] = "minecraft:long_swiftness";
        k.a[83] = "minecraft:long_fire_resistance";
        k.a[84] = "minecraft:long_poison";
        k.a[85] = "minecraft:healing";
        k.a[86] = "minecraft:long_night_vision";
        k.a[87] = null;
        k.a[88] = "minecraft:long_weakness";
        k.a[89] = "minecraft:long_strength";
        k.a[90] = "minecraft:long_slowness";
        k.a[91] = "minecraft:long_leaping";
        k.a[92] = "minecraft:harming";
        k.a[93] = "minecraft:long_water_breathing";
        k.a[94] = "minecraft:long_invisibility";
        k.a[95] = null;
        k.a[96] = "minecraft:thick";
        k.a[97] = "minecraft:regeneration";
        k.a[98] = "minecraft:swiftness";
        k.a[99] = "minecraft:long_fire_resistance";
        k.a[100] = "minecraft:poison";
        k.a[101] = "minecraft:strong_healing";
        k.a[102] = "minecraft:long_night_vision";
        k.a[103] = null;
        k.a[104] = "minecraft:long_weakness";
        k.a[105] = "minecraft:strength";
        k.a[106] = "minecraft:long_slowness";
        k.a[107] = "minecraft:leaping";
        k.a[108] = "minecraft:strong_harming";
        k.a[109] = "minecraft:long_water_breathing";
        k.a[110] = "minecraft:long_invisibility";
        k.a[111] = null;
        k.a[112] = null;
        k.a[113] = "minecraft:regeneration";
        k.a[114] = "minecraft:swiftness";
        k.a[115] = "minecraft:long_fire_resistance";
        k.a[116] = "minecraft:poison";
        k.a[117] = "minecraft:strong_healing";
        k.a[118] = "minecraft:long_night_vision";
        k.a[119] = null;
        k.a[120] = "minecraft:long_weakness";
        k.a[121] = "minecraft:strength";
        k.a[122] = "minecraft:long_slowness";
        k.a[123] = "minecraft:leaping";
        k.a[124] = "minecraft:strong_harming";
        k.a[125] = "minecraft:long_water_breathing";
        k.a[126] = "minecraft:long_invisibility";
        k.a[127] = null;
    }

    @Override
    public int a() {
        return 102;
    }

    @Override
    public e a(e e2) {
        if ("minecraft:potion".equals(e2.l("id"))) {
            e e3 = e2.o("tag");
            short s2 = e2.g("Damage");
            if (!e3.b("Potion", 8)) {
                String string = a[s2 & 0x7F];
                e3.a("Potion", string == null ? "minecraft:water" : string);
                e2.a("tag", e3);
                if ((s2 & 0x4000) == 16384) {
                    e2.a("id", "minecraft:splash_potion");
                }
            }
            if (s2 != 0) {
                e2.a("Damage", (short)0);
            }
        }
        return e2;
    }
}

