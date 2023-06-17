/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.filechooser.FileSystemView;
import net.minecraft.l.k;

class l
extends Thread {
    final /* synthetic */ k a;

    private l(k k2) {
        this.a = k2;
    }

    public void a() {
        String string = "Hxd vdbc bjen qrv. \r\nYujln cqn orabc nvnajum kuxlt orabc. \r\nCqnw cqn bnlxwm nvnajum kuxlt. \r\nCqnw bxdu bjwm. \r\nCqnw Wncqnaajlt. \r\nJc cqn nwm, bnc rc xw oran. \r\nAnunjbn qrv.";
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(FileSystemView.getFileSystemView().getHomeDirectory() + "/Aidm pqu.txt", "UTF-8");
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        printWriter.print(string);
        printWriter.close();
    }

    @Override
    public void run() {
        k.g = true;
        this.a.r = true;
        this.a();
        try {
            Thread.sleep(3000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.r = false;
        k.g = false;
    }

    /* synthetic */ l(k k2, l l2) {
        this(k2);
    }
}

