/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cvq
implements cui {
    private static final d a = c.c();
    private static final Map b;

    private static String a(String string) {
        return (String)b.get(new bpx(string).toString());
    }

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        if (!bvp2.b("tag", 10)) {
            return bvp2;
        }
        bvp bvp3 = bvp2.o("tag");
        if (bvp3.b("BlockEntityTag", 10)) {
            boolean bl2;
            bvp bvp4 = bvp3.o("BlockEntityTag");
            String string = bvp2.l("id");
            String string2 = cvq.a(string);
            if (string2 == null) {
                a.f("Unable to resolve BlockEntity for ItemInstance: {}", string);
                bl2 = false;
            } else {
                bl2 = !bvp4.e("id");
                bvp4.a("id", string2);
            }
            bzs2.a(bst.d, bvp4, n2);
            if (bl2) {
                bvp4.q("id");
            }
        }
        return bvp2;
    }

    static {
        Map map = b = sz.c();
        map.put("minecraft:furnace", "Furnace");
        map.put("minecraft:lit_furnace", "Furnace");
        map.put("minecraft:chest", "Chest");
        map.put("minecraft:trapped_chest", "Chest");
        map.put("minecraft:ender_chest", "EnderChest");
        map.put("minecraft:jukebox", "RecordPlayer");
        map.put("minecraft:dispenser", "Trap");
        map.put("minecraft:dropper", "Dropper");
        map.put("minecraft:sign", "Sign");
        map.put("minecraft:mob_spawner", "MobSpawner");
        map.put("minecraft:noteblock", "Music");
        map.put("minecraft:brewing_stand", "Cauldron");
        map.put("minecraft:enhanting_table", "EnchantTable");
        map.put("minecraft:command_block", "CommandBlock");
        map.put("minecraft:beacon", "Beacon");
        map.put("minecraft:skull", "Skull");
        map.put("minecraft:daylight_detector", "DLDetector");
        map.put("minecraft:hopper", "Hopper");
        map.put("minecraft:banner", "Banner");
        map.put("minecraft:flower_pot", "FlowerPot");
        map.put("minecraft:repeating_command_block", "CommandBlock");
        map.put("minecraft:chain_command_block", "CommandBlock");
        map.put("minecraft:standing_sign", "Sign");
        map.put("minecraft:wall_sign", "Sign");
        map.put("minecraft:piston_head", "Piston");
        map.put("minecraft:daylight_detector_inverted", "DLDetector");
        map.put("minecraft:unpowered_comparator", "Comparator");
        map.put("minecraft:powered_comparator", "Comparator");
        map.put("minecraft:wall_banner", "Banner");
        map.put("minecraft:standing_banner", "Banner");
        map.put("minecraft:structure_block", "Structure");
        map.put("minecraft:end_portal", "Airportal");
        map.put("minecraft:end_gateway", "EndGateway");
        map.put("minecraft:shield", "Shield");
    }
}

