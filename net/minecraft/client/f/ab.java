/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.io.File;
import java.io.FileNotFoundException;

public class ab
extends FileNotFoundException {
    public ab(File file, String string) {
        super(String.format("'%s' in ResourcePack '%s'", string, file));
    }
}

