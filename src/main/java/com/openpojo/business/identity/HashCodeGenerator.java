/*
 * Copyright (c) 2010-2015 Osman Shoukry
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, either version 3 of the License or any
 *    later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.openpojo.business.identity;

/**
 * This interface defines the contract for hash code generation handlers.
 *
 * @author oshoukry
 */
public interface HashCodeGenerator {

    /**
     * This method will calculate BusinessKey based hashcode.
     *
     * @param object
     *          Object to generate hashCode for.
     * @return
     *          generated hash code.
     */
    int doGenerate(Object object);
}
