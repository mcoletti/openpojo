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

package com.openpojo.random.map;

import java.util.Map;
import java.util.TreeMap;

import com.openpojo.random.ParameterizableRandomGenerator;
import com.openpojo.random.map.support.ComparableType1;
import com.openpojo.random.map.support.ComparableType2;
import com.openpojo.random.map.util.BaseMapRandomGeneratorTest;

/**
 * @author oshoukry
 */
public class TreeMapRandomGeneratorTest extends BaseMapRandomGeneratorTest {

    protected ParameterizableRandomGenerator getInstance() {
        return TreeMapRandomGenerator.getInstance();
    }


    protected Class<? extends ParameterizableRandomGenerator> getGeneratorClass() {
        return TreeMapRandomGenerator.class;
    }

    protected Class<? extends Map> getExpectedTypeClass() {
        return TreeMap.class;
    }

    protected Class<? extends Map> getGeneratedTypeClass() {
        return TreeMap.class;
    }

    protected Class<?> getGenericType1() {
        return ComparableType1.class;
    }

    protected Class<?> getGenericType2() {
        return ComparableType2.class;
    }
}
