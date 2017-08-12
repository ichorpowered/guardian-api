/*
 * MIT License
 *
 * Copyright (c) 2017 Connor Hartley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.ichorpowered.guardian.api.entry;

import com.google.common.reflect.TypeToken;

import java.util.Optional;
import java.util.UUID;

import javax.annotation.Nonnull;

/**
 * Represents an entry that is of an entity
 * that contains a reference to something that
 * may not exist, but can access and manipulate
 * some data.
 */
public interface EntityEntry {

    /**
     * Returns the entities unique identifier.
     *
     * @return the entities unique identifier
     */
    @Nonnull
    UUID getUniqueId();

    /**
     * Returns an {@link Optional} that may contain
     * the entity if it is present.
     *
     * @param <E> the entity type
     * @param typeToken the type token for the entity type
     * @return the entity reference if present
     */
    @Nonnull
    <E> Optional<E> getEntity(TypeToken<E> typeToken);

}