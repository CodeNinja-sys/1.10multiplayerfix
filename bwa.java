/*
 * Decompiled with CFR 0.150.
 */
public class bwa
implements akc {
    private static final String[] a = new String[128];

    @Override
    public int a() {
        return 102;
    }

    @Override
    public bvp a(bvp bvp2) {
        if ("minecraft:potion".equals(bvp2.l("id"))) {
            bvp bvp3 = bvp2.o("tag");
            short s2 = bvp2.g("Damage");
            if (!bvp3.b("Potion", 8)) {
                String string = a[s2 & 0x7F];
                bvp3.a("Potion", string == null ? "minecraft:water" : string);
                bvp2.a("tag", bvp3);
                if ((s2 & 0x4000) == 16384) {
                    bvp2.a("id", "minecraft:splash_potion");
                }
            }
            if (s2 != 0) {
                bvp2.a("Damage", (short)0);
            }
        }
        return bvp2;
    }

    static {
        bwa.a[0] = "minecraft:water";
        bwa.a[1] = "minecraft:regeneration";
        bwa.a[2] = "minecraft:swiftness";
        bwa.a[3] = "minecraft:fire_resistance";
        bwa.a[4] = "minecraft:poison";
        bwa.a[5] = "minecraft:healing";
        bwa.a[6] = "minecraft:night_vision";
        bwa.a[7] = null;
        bwa.a[8] = "minecraft:weakness";
        bwa.a[9] = "minecraft:strength";
        bwa.a[10] = "minecraft:slowness";
        bwa.a[11] = "minecraft:leaping";
        bwa.a[12] = "minecraft:harming";
        bwa.a[13] = "minecraft:water_breathing";
        bwa.a[14] = "minecraft:invisibility";
        bwa.a[15] = null;
        bwa.a[16] = "minecraft:awkward";
        bwa.a[17] = "minecraft:regeneration";
        bwa.a[18] = "minecraft:swiftness";
        bwa.a[19] = "minecraft:fire_resistance";
        bwa.a[20] = "minecraft:poison";
        bwa.a[21] = "minecraft:healing";
        bwa.a[22] = "minecraft:night_vision";
        bwa.a[23] = null;
        bwa.a[24] = "minecraft:weakness";
        bwa.a[25] = "minecraft:strength";
        bwa.a[26] = "minecraft:slowness";
        bwa.a[27] = "minecraft:leaping";
        bwa.a[28] = "minecraft:harming";
        bwa.a[29] = "minecraft:water_breathing";
        bwa.a[30] = "minecraft:invisibility";
        bwa.a[31] = null;
        bwa.a[32] = "minecraft:thick";
        bwa.a[33] = "minecraft:strong_regeneration";
        bwa.a[34] = "minecraft:strong_swiftness";
        bwa.a[35] = "minecraft:fire_resistance";
        bwa.a[36] = "minecraft:strong_poison";
        bwa.a[37] = "minecraft:strong_healing";
        bwa.a[38] = "minecraft:night_vision";
        bwa.a[39] = null;
        bwa.a[40] = "minecraft:weakness";
        bwa.a[41] = "minecraft:strong_strength";
        bwa.a[42] = "minecraft:slowness";
        bwa.a[43] = "minecraft:strong_leaping";
        bwa.a[44] = "minecraft:strong_harming";
        bwa.a[45] = "minecraft:water_breathing";
        bwa.a[46] = "minecraft:invisibility";
        bwa.a[47] = null;
        bwa.a[48] = null;
        bwa.a[49] = "minecraft:strong_regeneration";
        bwa.a[50] = "minecraft:strong_swiftness";
        bwa.a[51] = "minecraft:fire_resistance";
        bwa.a[52] = "minecraft:strong_poison";
        bwa.a[53] = "minecraft:strong_healing";
        bwa.a[54] = "minecraft:night_vision";
        bwa.a[55] = null;
        bwa.a[56] = "minecraft:weakness";
        bwa.a[57] = "minecraft:strong_strength";
        bwa.a[58] = "minecraft:slowness";
        bwa.a[59] = "minecraft:strong_leaping";
        bwa.a[60] = "minecraft:strong_harming";
        bwa.a[61] = "minecraft:water_breathing";
        bwa.a[62] = "minecraft:invisibility";
        bwa.a[63] = null;
        bwa.a[64] = "minecraft:mundane";
        bwa.a[65] = "minecraft:long_regeneration";
        bwa.a[66] = "minecraft:long_swiftness";
        bwa.a[67] = "minecraft:long_fire_resistance";
        bwa.a[68] = "minecraft:long_poison";
        bwa.a[69] = "minecraft:healing";
        bwa.a[70] = "minecraft:long_night_vision";
        bwa.a[71] = null;
        bwa.a[72] = "minecraft:long_weakness";
        bwa.a[73] = "minecraft:long_strength";
        bwa.a[74] = "minecraft:long_slowness";
        bwa.a[75] = "minecraft:long_leaping";
        bwa.a[76] = "minecraft:harming";
        bwa.a[77] = "minecraft:long_water_breathing";
        bwa.a[78] = "minecraft:long_invisibility";
        bwa.a[79] = null;
        bwa.a[80] = "minecraft:awkward";
        bwa.a[81] = "minecraft:long_regeneration";
        bwa.a[82] = "minecraft:long_swiftness";
        bwa.a[83] = "minecraft:long_fire_resistance";
        bwa.a[84] = "minecraft:long_poison";
        bwa.a[85] = "minecraft:healing";
        bwa.a[86] = "minecraft:long_night_vision";
        bwa.a[87] = null;
        bwa.a[88] = "minecraft:long_weakness";
        bwa.a[89] = "minecraft:long_strength";
        bwa.a[90] = "minecraft:long_slowness";
        bwa.a[91] = "minecraft:long_leaping";
        bwa.a[92] = "minecraft:harming";
        bwa.a[93] = "minecraft:long_water_breathing";
        bwa.a[94] = "minecraft:long_invisibility";
        bwa.a[95] = null;
        bwa.a[96] = "minecraft:thick";
        bwa.a[97] = "minecraft:regeneration";
        bwa.a[98] = "minecraft:swiftness";
        bwa.a[99] = "minecraft:long_fire_resistance";
        bwa.a[100] = "minecraft:poison";
        bwa.a[101] = "minecraft:strong_healing";
        bwa.a[102] = "minecraft:long_night_vision";
        bwa.a[103] = null;
        bwa.a[104] = "minecraft:long_weakness";
        bwa.a[105] = "minecraft:strength";
        bwa.a[106] = "minecraft:long_slowness";
        bwa.a[107] = "minecraft:leaping";
        bwa.a[108] = "minecraft:strong_harming";
        bwa.a[109] = "minecraft:long_water_breathing";
        bwa.a[110] = "minecraft:long_invisibility";
        bwa.a[111] = null;
        bwa.a[112] = null;
        bwa.a[113] = "minecraft:regeneration";
        bwa.a[114] = "minecraft:swiftness";
        bwa.a[115] = "minecraft:long_fire_resistance";
        bwa.a[116] = "minecraft:poison";
        bwa.a[117] = "minecraft:strong_healing";
        bwa.a[118] = "minecraft:long_night_vision";
        bwa.a[119] = null;
        bwa.a[120] = "minecraft:long_weakness";
        bwa.a[121] = "minecraft:strength";
        bwa.a[122] = "minecraft:long_slowness";
        bwa.a[123] = "minecraft:leaping";
        bwa.a[124] = "minecraft:strong_harming";
        bwa.a[125] = "minecraft:long_water_breathing";
        bwa.a[126] = "minecraft:long_invisibility";
        bwa.a[127] = null;
    }
}

