/**
 * Copyright (c) 2010 Ignasi Barrera
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.sjmvc;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Plain object used to perform binding tests.
 * 
 * @author Ignasi Barrera
 */
public class TestPojo implements Serializable
{
	/** Serial UID. */
	private static final long serialVersionUID = 1L;

	/** A String property. */
	@NotNull
	@Length(min = 1, max = 5)
	private String stringProperty;

	/** An Integer property. */
	@Min(1)
	@Max(30)
	private Integer integerProperty;

	/** A nested property. */
	@NotNull
	private NestedTestPojo nestedProperty;

	/** A list of Strings. */
	private List<String> stringList;

	/** A list of Integers. */
	private List<Integer> integerList;

	/** An array of Strings. */
	private String[] stringArray;

	/** An array of Integers. */
	private Integer[] integerArray;

	/**
	 * Sets teh required fields to pass validation.
	 */
	public void setRequiredFields()
	{
		setStringProperty("abc");
		setIntegerProperty(2);
		setNestedProperty(new NestedTestPojo());
		getNestedProperty().setStringProperty(new String());
	}

	// Getters and setters

	public String getStringProperty()
	{
		return stringProperty;
	}

	public void setStringProperty(String stringProperty)
	{
		this.stringProperty = stringProperty;
	}

	public Integer getIntegerProperty()
	{
		return integerProperty;
	}

	public void setIntegerProperty(Integer integerProperty)
	{
		this.integerProperty = integerProperty;
	}

	public NestedTestPojo getNestedProperty()
	{
		return nestedProperty;
	}

	public void setNestedProperty(NestedTestPojo nestedProperty)
	{
		this.nestedProperty = nestedProperty;
	}

	public List<String> getStringList()
	{
		return stringList;
	}

	public void setStringList(List<String> stringList)
	{
		this.stringList = stringList;
	}

	public List<Integer> getIntegerList()
	{
		return integerList;
	}

	public void setIntegerList(List<Integer> integerList)
	{
		this.integerList = integerList;
	}

	public String[] getStringArray()
	{
		return stringArray;
	}

	public void setStringArray(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	public Integer[] getIntegerArray()
	{
		return integerArray;
	}

	public void setIntegerArray(Integer[] integerArray)
	{
		this.integerArray = integerArray;
	}

}
