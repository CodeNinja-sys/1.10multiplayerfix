/*
 * Decompiled with CFR 0.150.
 */
public class bi {
    public static final apg a = new apg();
    private final bpx b;
    private static int c;

    public bi(bpx bpx2) {
        this.b = bpx2;
    }

    public bpx a() {
        return this.b;
    }

    public static void b() {
        bi.a("ambient.cave");
        bi.a("block.anvil.break");
        bi.a("block.anvil.destroy");
        bi.a("block.anvil.fall");
        bi.a("block.anvil.hit");
        bi.a("block.anvil.land");
        bi.a("block.anvil.place");
        bi.a("block.anvil.step");
        bi.a("block.anvil.use");
        bi.a("block.brewing_stand.brew");
        bi.a("block.chest.close");
        bi.a("block.chest.locked");
        bi.a("block.chest.open");
        bi.a("block.chorus_flower.death");
        bi.a("block.chorus_flower.grow");
        bi.a("block.cloth.break");
        bi.a("block.cloth.fall");
        bi.a("block.cloth.hit");
        bi.a("block.cloth.place");
        bi.a("block.cloth.step");
        bi.a("block.comparator.click");
        bi.a("block.dispenser.dispense");
        bi.a("block.dispenser.fail");
        bi.a("block.dispenser.launch");
        bi.a("block.enchantment_table.use");
        bi.a("block.end_gateway.spawn");
        bi.a("block.enderchest.close");
        bi.a("block.enderchest.open");
        bi.a("block.fence_gate.close");
        bi.a("block.fence_gate.open");
        bi.a("block.fire.ambient");
        bi.a("block.fire.extinguish");
        bi.a("block.furnace.fire_crackle");
        bi.a("block.glass.break");
        bi.a("block.glass.fall");
        bi.a("block.glass.hit");
        bi.a("block.glass.place");
        bi.a("block.glass.step");
        bi.a("block.grass.break");
        bi.a("block.grass.fall");
        bi.a("block.grass.hit");
        bi.a("block.grass.place");
        bi.a("block.grass.step");
        bi.a("block.gravel.break");
        bi.a("block.gravel.fall");
        bi.a("block.gravel.hit");
        bi.a("block.gravel.place");
        bi.a("block.gravel.step");
        bi.a("block.iron_door.close");
        bi.a("block.iron_door.open");
        bi.a("block.iron_trapdoor.close");
        bi.a("block.iron_trapdoor.open");
        bi.a("block.ladder.break");
        bi.a("block.ladder.fall");
        bi.a("block.ladder.hit");
        bi.a("block.ladder.place");
        bi.a("block.ladder.step");
        bi.a("block.lava.ambient");
        bi.a("block.lava.extinguish");
        bi.a("block.lava.pop");
        bi.a("block.lever.click");
        bi.a("block.metal.break");
        bi.a("block.metal.fall");
        bi.a("block.metal.hit");
        bi.a("block.metal.place");
        bi.a("block.metal.step");
        bi.a("block.metal_pressureplate.click_off");
        bi.a("block.metal_pressureplate.click_on");
        bi.a("block.note.basedrum");
        bi.a("block.note.bass");
        bi.a("block.note.harp");
        bi.a("block.note.hat");
        bi.a("block.note.pling");
        bi.a("block.note.snare");
        bi.a("block.piston.contract");
        bi.a("block.piston.extend");
        bi.a("block.portal.ambient");
        bi.a("block.portal.travel");
        bi.a("block.portal.trigger");
        bi.a("block.redstone_torch.burnout");
        bi.a("block.sand.break");
        bi.a("block.sand.fall");
        bi.a("block.sand.hit");
        bi.a("block.sand.place");
        bi.a("block.sand.step");
        bi.a("block.slime.break");
        bi.a("block.slime.fall");
        bi.a("block.slime.hit");
        bi.a("block.slime.place");
        bi.a("block.slime.step");
        bi.a("block.snow.break");
        bi.a("block.snow.fall");
        bi.a("block.snow.hit");
        bi.a("block.snow.place");
        bi.a("block.snow.step");
        bi.a("block.stone.break");
        bi.a("block.stone.fall");
        bi.a("block.stone.hit");
        bi.a("block.stone.place");
        bi.a("block.stone.step");
        bi.a("block.stone_button.click_off");
        bi.a("block.stone_button.click_on");
        bi.a("block.stone_pressureplate.click_off");
        bi.a("block.stone_pressureplate.click_on");
        bi.a("block.tripwire.attach");
        bi.a("block.tripwire.click_off");
        bi.a("block.tripwire.click_on");
        bi.a("block.tripwire.detach");
        bi.a("block.water.ambient");
        bi.a("block.waterlily.place");
        bi.a("block.wood.break");
        bi.a("block.wood.fall");
        bi.a("block.wood.hit");
        bi.a("block.wood.place");
        bi.a("block.wood.step");
        bi.a("block.wood_button.click_off");
        bi.a("block.wood_button.click_on");
        bi.a("block.wood_pressureplate.click_off");
        bi.a("block.wood_pressureplate.click_on");
        bi.a("block.wooden_door.close");
        bi.a("block.wooden_door.open");
        bi.a("block.wooden_trapdoor.close");
        bi.a("block.wooden_trapdoor.open");
        bi.a("enchant.thorns.hit");
        bi.a("entity.armorstand.break");
        bi.a("entity.armorstand.fall");
        bi.a("entity.armorstand.hit");
        bi.a("entity.armorstand.place");
        bi.a("entity.arrow.hit");
        bi.a("entity.arrow.hit_player");
        bi.a("entity.arrow.shoot");
        bi.a("entity.bat.ambient");
        bi.a("entity.bat.death");
        bi.a("entity.bat.hurt");
        bi.a("entity.bat.loop");
        bi.a("entity.bat.takeoff");
        bi.a("entity.blaze.ambient");
        bi.a("entity.blaze.burn");
        bi.a("entity.blaze.death");
        bi.a("entity.blaze.hurt");
        bi.a("entity.blaze.shoot");
        bi.a("entity.bobber.splash");
        bi.a("entity.bobber.throw");
        bi.a("entity.cat.ambient");
        bi.a("entity.cat.death");
        bi.a("entity.cat.hiss");
        bi.a("entity.cat.hurt");
        bi.a("entity.cat.purr");
        bi.a("entity.cat.purreow");
        bi.a("entity.chicken.ambient");
        bi.a("entity.chicken.death");
        bi.a("entity.chicken.egg");
        bi.a("entity.chicken.hurt");
        bi.a("entity.chicken.step");
        bi.a("entity.cow.ambient");
        bi.a("entity.cow.death");
        bi.a("entity.cow.hurt");
        bi.a("entity.cow.milk");
        bi.a("entity.cow.step");
        bi.a("entity.creeper.death");
        bi.a("entity.creeper.hurt");
        bi.a("entity.creeper.primed");
        bi.a("entity.donkey.ambient");
        bi.a("entity.donkey.angry");
        bi.a("entity.donkey.chest");
        bi.a("entity.donkey.death");
        bi.a("entity.donkey.hurt");
        bi.a("entity.egg.throw");
        bi.a("entity.elder_guardian.ambient");
        bi.a("entity.elder_guardian.ambient_land");
        bi.a("entity.elder_guardian.curse");
        bi.a("entity.elder_guardian.death");
        bi.a("entity.elder_guardian.death_land");
        bi.a("entity.elder_guardian.hurt");
        bi.a("entity.elder_guardian.hurt_land");
        bi.a("entity.enderdragon.ambient");
        bi.a("entity.enderdragon.death");
        bi.a("entity.enderdragon.flap");
        bi.a("entity.enderdragon.growl");
        bi.a("entity.enderdragon.hurt");
        bi.a("entity.enderdragon.shoot");
        bi.a("entity.enderdragon_fireball.explode");
        bi.a("entity.endereye.launch");
        bi.a("entity.endermen.ambient");
        bi.a("entity.endermen.death");
        bi.a("entity.endermen.hurt");
        bi.a("entity.endermen.scream");
        bi.a("entity.endermen.stare");
        bi.a("entity.endermen.teleport");
        bi.a("entity.endermite.ambient");
        bi.a("entity.endermite.death");
        bi.a("entity.endermite.hurt");
        bi.a("entity.endermite.step");
        bi.a("entity.enderpearl.throw");
        bi.a("entity.experience_bottle.throw");
        bi.a("entity.experience_orb.pickup");
        bi.a("entity.experience_orb.touch");
        bi.a("entity.firework.blast");
        bi.a("entity.firework.blast_far");
        bi.a("entity.firework.large_blast");
        bi.a("entity.firework.large_blast_far");
        bi.a("entity.firework.launch");
        bi.a("entity.firework.shoot");
        bi.a("entity.firework.twinkle");
        bi.a("entity.firework.twinkle_far");
        bi.a("entity.generic.big_fall");
        bi.a("entity.generic.burn");
        bi.a("entity.generic.death");
        bi.a("entity.generic.drink");
        bi.a("entity.generic.eat");
        bi.a("entity.generic.explode");
        bi.a("entity.generic.extinguish_fire");
        bi.a("entity.generic.hurt");
        bi.a("entity.generic.small_fall");
        bi.a("entity.generic.splash");
        bi.a("entity.generic.swim");
        bi.a("entity.ghast.ambient");
        bi.a("entity.ghast.death");
        bi.a("entity.ghast.hurt");
        bi.a("entity.ghast.scream");
        bi.a("entity.ghast.shoot");
        bi.a("entity.ghast.warn");
        bi.a("entity.guardian.ambient");
        bi.a("entity.guardian.ambient_land");
        bi.a("entity.guardian.attack");
        bi.a("entity.guardian.death");
        bi.a("entity.guardian.death_land");
        bi.a("entity.guardian.flop");
        bi.a("entity.guardian.hurt");
        bi.a("entity.guardian.hurt_land");
        bi.a("entity.horse.ambient");
        bi.a("entity.horse.angry");
        bi.a("entity.horse.armor");
        bi.a("entity.horse.breathe");
        bi.a("entity.horse.death");
        bi.a("entity.horse.eat");
        bi.a("entity.horse.gallop");
        bi.a("entity.horse.hurt");
        bi.a("entity.horse.jump");
        bi.a("entity.horse.land");
        bi.a("entity.horse.saddle");
        bi.a("entity.horse.step");
        bi.a("entity.horse.step_wood");
        bi.a("entity.hostile.big_fall");
        bi.a("entity.hostile.death");
        bi.a("entity.hostile.hurt");
        bi.a("entity.hostile.small_fall");
        bi.a("entity.hostile.splash");
        bi.a("entity.hostile.swim");
        bi.a("entity.husk.ambient");
        bi.a("entity.husk.death");
        bi.a("entity.husk.hurt");
        bi.a("entity.husk.step");
        bi.a("entity.irongolem.attack");
        bi.a("entity.irongolem.death");
        bi.a("entity.irongolem.hurt");
        bi.a("entity.irongolem.step");
        bi.a("entity.item.break");
        bi.a("entity.item.pickup");
        bi.a("entity.itemframe.add_item");
        bi.a("entity.itemframe.break");
        bi.a("entity.itemframe.place");
        bi.a("entity.itemframe.remove_item");
        bi.a("entity.itemframe.rotate_item");
        bi.a("entity.leashknot.break");
        bi.a("entity.leashknot.place");
        bi.a("entity.lightning.impact");
        bi.a("entity.lightning.thunder");
        bi.a("entity.lingeringpotion.throw");
        bi.a("entity.magmacube.death");
        bi.a("entity.magmacube.hurt");
        bi.a("entity.magmacube.jump");
        bi.a("entity.magmacube.squish");
        bi.a("entity.minecart.inside");
        bi.a("entity.minecart.riding");
        bi.a("entity.mooshroom.shear");
        bi.a("entity.mule.ambient");
        bi.a("entity.mule.death");
        bi.a("entity.mule.hurt");
        bi.a("entity.painting.break");
        bi.a("entity.painting.place");
        bi.a("entity.pig.ambient");
        bi.a("entity.pig.death");
        bi.a("entity.pig.hurt");
        bi.a("entity.pig.saddle");
        bi.a("entity.pig.step");
        bi.a("entity.player.attack.crit");
        bi.a("entity.player.attack.knockback");
        bi.a("entity.player.attack.nodamage");
        bi.a("entity.player.attack.strong");
        bi.a("entity.player.attack.sweep");
        bi.a("entity.player.attack.weak");
        bi.a("entity.player.big_fall");
        bi.a("entity.player.breath");
        bi.a("entity.player.burp");
        bi.a("entity.player.death");
        bi.a("entity.player.hurt");
        bi.a("entity.player.levelup");
        bi.a("entity.player.small_fall");
        bi.a("entity.player.splash");
        bi.a("entity.player.swim");
        bi.a("entity.polar_bear.ambient");
        bi.a("entity.polar_bear.baby_ambient");
        bi.a("entity.polar_bear.death");
        bi.a("entity.polar_bear.hurt");
        bi.a("entity.polar_bear.step");
        bi.a("entity.polar_bear.warning");
        bi.a("entity.rabbit.ambient");
        bi.a("entity.rabbit.attack");
        bi.a("entity.rabbit.death");
        bi.a("entity.rabbit.hurt");
        bi.a("entity.rabbit.jump");
        bi.a("entity.sheep.ambient");
        bi.a("entity.sheep.death");
        bi.a("entity.sheep.hurt");
        bi.a("entity.sheep.shear");
        bi.a("entity.sheep.step");
        bi.a("entity.shulker.ambient");
        bi.a("entity.shulker.close");
        bi.a("entity.shulker.death");
        bi.a("entity.shulker.hurt");
        bi.a("entity.shulker.hurt_closed");
        bi.a("entity.shulker.open");
        bi.a("entity.shulker.shoot");
        bi.a("entity.shulker.teleport");
        bi.a("entity.shulker_bullet.hit");
        bi.a("entity.shulker_bullet.hurt");
        bi.a("entity.silverfish.ambient");
        bi.a("entity.silverfish.death");
        bi.a("entity.silverfish.hurt");
        bi.a("entity.silverfish.step");
        bi.a("entity.skeleton.ambient");
        bi.a("entity.skeleton.death");
        bi.a("entity.skeleton.hurt");
        bi.a("entity.skeleton.shoot");
        bi.a("entity.skeleton.step");
        bi.a("entity.skeleton_horse.ambient");
        bi.a("entity.skeleton_horse.death");
        bi.a("entity.skeleton_horse.hurt");
        bi.a("entity.slime.attack");
        bi.a("entity.slime.death");
        bi.a("entity.slime.hurt");
        bi.a("entity.slime.jump");
        bi.a("entity.slime.squish");
        bi.a("entity.small_magmacube.death");
        bi.a("entity.small_magmacube.hurt");
        bi.a("entity.small_magmacube.squish");
        bi.a("entity.small_slime.death");
        bi.a("entity.small_slime.hurt");
        bi.a("entity.small_slime.jump");
        bi.a("entity.small_slime.squish");
        bi.a("entity.snowball.throw");
        bi.a("entity.snowman.ambient");
        bi.a("entity.snowman.death");
        bi.a("entity.snowman.hurt");
        bi.a("entity.snowman.shoot");
        bi.a("entity.spider.ambient");
        bi.a("entity.spider.death");
        bi.a("entity.spider.hurt");
        bi.a("entity.spider.step");
        bi.a("entity.splash_potion.break");
        bi.a("entity.splash_potion.throw");
        bi.a("entity.squid.ambient");
        bi.a("entity.squid.death");
        bi.a("entity.squid.hurt");
        bi.a("entity.stray.ambient");
        bi.a("entity.stray.death");
        bi.a("entity.stray.hurt");
        bi.a("entity.stray.step");
        bi.a("entity.tnt.primed");
        bi.a("entity.villager.ambient");
        bi.a("entity.villager.death");
        bi.a("entity.villager.hurt");
        bi.a("entity.villager.no");
        bi.a("entity.villager.trading");
        bi.a("entity.villager.yes");
        bi.a("entity.witch.ambient");
        bi.a("entity.witch.death");
        bi.a("entity.witch.drink");
        bi.a("entity.witch.hurt");
        bi.a("entity.witch.throw");
        bi.a("entity.wither.ambient");
        bi.a("entity.wither.break_block");
        bi.a("entity.wither.death");
        bi.a("entity.wither.hurt");
        bi.a("entity.wither.shoot");
        bi.a("entity.wither.spawn");
        bi.a("entity.wither_skeleton.ambient");
        bi.a("entity.wither_skeleton.death");
        bi.a("entity.wither_skeleton.hurt");
        bi.a("entity.wither_skeleton.step");
        bi.a("entity.wolf.ambient");
        bi.a("entity.wolf.death");
        bi.a("entity.wolf.growl");
        bi.a("entity.wolf.howl");
        bi.a("entity.wolf.hurt");
        bi.a("entity.wolf.pant");
        bi.a("entity.wolf.shake");
        bi.a("entity.wolf.step");
        bi.a("entity.wolf.whine");
        bi.a("entity.zombie.ambient");
        bi.a("entity.zombie.attack_door_wood");
        bi.a("entity.zombie.attack_iron_door");
        bi.a("entity.zombie.break_door_wood");
        bi.a("entity.zombie.death");
        bi.a("entity.zombie.hurt");
        bi.a("entity.zombie.infect");
        bi.a("entity.zombie.step");
        bi.a("entity.zombie_horse.ambient");
        bi.a("entity.zombie_horse.death");
        bi.a("entity.zombie_horse.hurt");
        bi.a("entity.zombie_pig.ambient");
        bi.a("entity.zombie_pig.angry");
        bi.a("entity.zombie_pig.death");
        bi.a("entity.zombie_pig.hurt");
        bi.a("entity.zombie_villager.ambient");
        bi.a("entity.zombie_villager.converted");
        bi.a("entity.zombie_villager.cure");
        bi.a("entity.zombie_villager.death");
        bi.a("entity.zombie_villager.hurt");
        bi.a("entity.zombie_villager.step");
        bi.a("item.armor.equip_chain");
        bi.a("item.armor.equip_diamond");
        bi.a("item.armor.equip_generic");
        bi.a("item.armor.equip_gold");
        bi.a("item.armor.equip_iron");
        bi.a("item.armor.equip_leather");
        bi.a("item.bottle.fill");
        bi.a("item.bottle.fill_dragonbreath");
        bi.a("item.bucket.empty");
        bi.a("item.bucket.empty_lava");
        bi.a("item.bucket.fill");
        bi.a("item.bucket.fill_lava");
        bi.a("item.chorus_fruit.teleport");
        bi.a("item.elytra.flying");
        bi.a("item.firecharge.use");
        bi.a("item.flintandsteel.use");
        bi.a("item.hoe.till");
        bi.a("item.shield.block");
        bi.a("item.shield.break");
        bi.a("item.shovel.flatten");
        bi.a("music.creative");
        bi.a("music.credits");
        bi.a("music.dragon");
        bi.a("music.end");
        bi.a("music.game");
        bi.a("music.menu");
        bi.a("music.nether");
        bi.a("record.11");
        bi.a("record.13");
        bi.a("record.blocks");
        bi.a("record.cat");
        bi.a("record.chirp");
        bi.a("record.far");
        bi.a("record.mall");
        bi.a("record.mellohi");
        bi.a("record.stal");
        bi.a("record.strad");
        bi.a("record.wait");
        bi.a("record.ward");
        bi.a("ui.button.click");
        bi.a("weather.rain");
        bi.a("weather.rain.above");
    }

    private static void a(String string) {
        bpx bpx2 = new bpx(string);
        a.a(c++, bpx2, new bi(bpx2));
    }
}

