package net.mikasa.mikasaweb.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;

import net.mikasa.mikasaweb.model.User;

public class UserAdministration extends AdministrationConfiguration <User>
{
	public EntityMetadataConfigurationUnit configuration( EntityMetadataConfigurationUnitBuilder configurationBuilder ) {
    return configurationBuilder.nameField( "username" ).build();
  }

  public ScreenContextConfigurationUnit screenContext( ScreenContextConfigurationUnitBuilder screenContextBuilder ) {
    return screenContextBuilder
      .screenName( "Users Administration" )
      .build();
  }

  public FieldSetConfigurationUnit listView( final FieldSetConfigurationUnitBuilder fragmentBuilder ) {
    return fragmentBuilder
      .field( "username" ).caption( "First Name" )
      .field( "password" ).caption( "Last Name" )
      .build();
  }
}