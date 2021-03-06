package org.rapidoid.gui;

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.gui.base.AbstractWidget;
import org.rapidoid.html.impl.TagRenderer;
import org.rapidoid.u.U;

import java.util.List;

/*
 * #%L
 * rapidoid-gui
 * %%
 * Copyright (C) 2014 - 2017 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

@Authors("Nikolche Mihajlovski")
@Since("4.1.0")
public class MultiWidget extends AbstractWidget {

	private final List<Object> elements;

	public MultiWidget(Object[] elements) {
		this.elements = U.list(elements);
	}

	@Override
	protected Object render() {
		return GUI.hardcoded(TagRenderer.get().toHTML(elements, null));
	}

	public void add(Object element) {
		elements.add(element);
	}

	public void remove(Object element) {
		elements.remove(element);
	}

	public void clear() {
		elements.clear();
	}

}
