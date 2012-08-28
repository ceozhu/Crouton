/*
 * Copyright 2012 Neofonie Mobile GmbH
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.neofonie.mobile.app.android.widget.crouton;


import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;


/**
 * Style <br>
 * <br>
 * <p/>
 * The style for a {@link Crouton}.
 */

public class Style {
	public static final Style ALERT = new Builder().setDuration(
		5000).setTextColor(android.R.color.holo_red_light).setHeight(
		LayoutParams.WRAP_CONTENT).build();

	public static final Style CONFIRM = new Builder().setDuration(
		3000).setTextColor(android.R.color.holo_green_light).setHeight(
		LayoutParams.WRAP_CONTENT).build();

	public static final Style INFO = new Builder().setDuration(3000).setTextColor(
		android.R.color.holo_blue_bright).setHeight(
		LayoutParams.WRAP_CONTENT).build();
	/**
	 * The duration the {@link Crouton} will be displayed in milliseconds.
	 */
	final int duration;

	/**
	 * The colorResourceId's resource id.
	 */
	final int colorResourceId;

	/**
	 * The height of the {@link Crouton} in pixels.
	 */
	final int height;

	/**
	 * The resource id of the background.
	 * <p/>
	 * 0 for no background.
	 */
	final int background;

	/**
	 * Whether we should isTileEnabled the background or not.
	 */
	final boolean tile;

	/**
	 * The text colorResourceId's resource id.
	 * <p/>
	 * 0 sets the text colorResourceId to the system theme default.
	 */
	final int textColor;

	/**
	 * The text's gravity as provided by {@link Gravity}.
	 */
	final int gravity;

	/**
	 * An additional image to display in the {@link Crouton}.
	 */
	final Drawable image;

	private Style(final Builder builder) {
		this.duration = builder.duration;
		this.colorResourceId = builder.colorResourceId;
		this.height = builder.height;
		this.background = builder.background;
		this.tile = builder.isTileEnabled;
		this.textColor = builder.textColor;
		this.gravity = builder.gravity;
		this.image = builder.image;
	}

	/**
	 * Builder for the {@link Style} object.
	 */
	public static class Builder {
		private int duration;
		private int colorResourceId;
		private int height;
		private int background;
		private boolean isTileEnabled;
		private int textColor;
		private int gravity;
		private Drawable image;

		public Builder() {
			initDefaults();
		}

		/**
		 * Init the {@link Builder} with default options.
		 */
		private void initDefaults() {
			duration = 3000;
			colorResourceId = android.R.color.holo_blue_bright;
			height = ViewGroup.LayoutParams.WRAP_CONTENT;
			background = 0;
			isTileEnabled = false;
			textColor = android.R.color.white;
			gravity = Gravity.CENTER;
			image = null;
		}

		/**
		 * Set the duration option of the {@link Crouton}.
		 *
		 * @param duration The duration the crouton will be displayed {@link Crouton}
		 * in milliseconds.
		 * @return the {@link Builder}.
		 */
		public Builder setDuration(int duration) {
			this.duration = duration;

			return this;
		}

		/**
		 * Set the colorResourceId option of the {@link Crouton}.
		 *
		 * @param colorResourceId The colorResourceId's resource id.
		 * @return the {@link Builder}.
		 */
		public Builder setColor(int colorResourceId) {
			this.colorResourceId = colorResourceId;

			return this;
		}

		/**
		 * Set the height option for the {@link Crouton}.
		 *
		 * @param height The height of the {@link Crouton} in pixel. Can also be
		 * {@link LayoutParams#MATCH_PARENT} or
		 * {@link LayoutParams#WRAP_CONTENT}.
		 * @return the {@link Builder}.
		 */
		public Builder setHeight(int height) {
			this.height = height;

			return this;
		}

		/**
		 * Set the background option for the {@link Crouton}.
		 *
		 * @param background Resource ID of a background image drawable.
		 * @return the {@link Builder}.
		 */
		public Builder setBackground(int background) {
			this.background = background;

			return this;
		}

		/**
		 * Set the isTileEnabled option for the {@link Crouton}.
		 *
		 * @param isTileEnabled <code>true</code> if you want the background to be tiled,
		 * else <code>false</code>.
		 * @return the {@link Builder}.
		 */
		public Builder setTileEnabled(boolean isTileEnabled) {
			this.isTileEnabled = isTileEnabled;

			return this;
		}

		/**
		 * Set the textColor option for the {@link Crouton}.
		 *
		 * @param textColor The resource id of the text colorResourceId.
		 * @return the {@link Builder}.
		 */
		public Builder setTextColor(int textColor) {
			this.textColor = textColor;

			return this;
		}

		/**
		 * Set the gravity option for the {@link Crouton}.
		 *
		 * @param gravity The text's gravity as provided by {@link Gravity}.
		 * @return the {@link Builder}.
		 */
		public Builder setGravity(int gravity) {
			this.gravity = gravity;

			return this;
		}

		/**
		 * Set the image option for the {@link Crouton}.
		 *
		 * @param image An additional image to display in the {@link Crouton}.
		 * @return the {@link Builder}.
		 */
		public Builder setImage(Drawable image) {
			this.image = image;

			return this;
		}

		/**
		 * @return a configured {@link Style} object.
		 */
		public Style build() {
			return new Style(this);
		}
	}
}
