/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.security.SecureRandom;
import java.util.concurrent.BlockingQueue;

final class ah
extends Thread {
    final /* synthetic */ BlockingQueue a;

    ah(String string, BlockingQueue blockingQueue) {
        this.a = blockingQueue;
        super(string);
    }

    @Override
    public void run() {
        SecureRandom secureRandom = new SecureRandom();
        this.a.add(secureRandom.generateSeed(8));
    }
}

