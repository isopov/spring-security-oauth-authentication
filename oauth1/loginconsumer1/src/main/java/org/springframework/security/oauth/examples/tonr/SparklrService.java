package org.springframework.security.oauth.examples.tonr;

import java.io.InputStream;
import java.util.List;

/**
 * @author Ryan Heaton
 */
public interface SparklrService {

	/**
	 * Get the list of Sparklr photo ids for the current user.
	 * 
	 * @return The list of photo ids for the current user.
	 */
	List<String> getSparklrPhotoIds();

	/**
	 * Loads the Sparklr photo for the current user.
	 * 
	 * @param id
	 *            the id or the photo.
	 * @return The sparklr photo.
	 */
	InputStream loadSparklrPhoto(String id);
}