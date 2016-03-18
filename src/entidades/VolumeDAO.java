package entidades;

import java.io.IOException;

public interface VolumeDAO {
	public void persist(Volume p);
	public Volume selectById(final int id);
	public void merge(Volume v);
	public void removeById(final int id);
}
