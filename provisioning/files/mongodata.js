db = connect("localhost:27017/mikasadb");
db.plans.insertMany([
  {name:'Plan Comunicación País Vasco',plantype:'M'},
  {name:'Plan Comunicación Cataluña',plantype:'M'},
  {name:'Plan Comunicación Galicia',plantype:'M'},
  {name:'Plan Comunicación Andalucía',plantype:'P'},
  {name:'Plan Comunicación Asturias',plantype:'M'},
  {name:'Plan Comunicación Cantabria',plantype:'M'},
  {name:'Plan Comunicación La Rioja',plantype:'M'},
  {name:'Plan Comunicación Región de Murcia',plantype:'P'},
  {name:'Plan Comunicación Comunidad Valenciana',plantype:'P'},
  {name:'Plan Comunicación Aragón',plantype:'P'},
  {name:'Plan Comunicación Castilla - La Mancha',plantype:'P'},
  {name:'Plan Comunicación Canarias',plantype:'P'},
  {name:'Plan Comunicación Navarra',plantype:'P'},
  {name:'Plan Comunicación Extremadura',plantype:'P'},
  {name:'Plan Comunicación Baleares',plantype:'M'},
  {name:'Plan Comunicación Madrid',plantype:'P'},
  {name:'Plan Comunicación Castilla y León',plantype:'P'},
  {name:'Plan Comunicación Ceuta',plantype:'P'},
  {name:'Plan Comunicación Melilla',plantype:'P'},
  {name:'Plan Comunicación I+D+i y Economía del Conocimiento',plantype:'M'},
  {name:'Plan Comunicación Fondo Cohesión FEDER',plantype:'P'},
  {name:'Todos los Planes de Comunicación',plantype:'M'}  
]);
db.indicatorTypes.insertMany([
  {description:'Nº actividades y actos públicos'},
  {description:'Nº de acciones de difusión'},
  {description:'Nº de publicaciones externas realizadas'},
  {description:'Nº de páginas web'},
  {description:'Nº de soportes publicitarios'},
  {description:'Nº de documentación interna distribuida'},
  {description:'Nº de redes de información y publicidad'}
]);
db.activities.insertMany([
  {name:'Inauguración del curso Los retos de España ante la política de cohesión europea 2007-2013',date:'15/10/2009',assistants:40,amount:0,owner:'13744917W'},
  {name:'Firma del PO FEDER Cantabria',date:'15/10/2009',assistants:59,amount:0,owner:'13744917W'},
  {name:'Constitución del Consejo local del Urban',date:'15/10/2009',assistants:35,amount:0,owner:'13744917W'},
  {name:'Presentación de la campaña Cantabria en Red 2008',date:'15/10/2009',assistants:20,amount:0,owner:'13744917W'},
  {name:'Actos del Día de Europa presididos por Dolores Gorostiaga',date:'15/10/2009',assistants:96,amount:0,owner:'13744917W'},
  {name:'Presentación del programa de actividades del Día de Europa 2008',date:'15/10/2009',assistants:40,amount:0,owner:'13744917W'},
  {name:'Visita de García Cerviño al PIE de Santoña',date:'15/10/2009',assistants:36,amount:0,owner:'13744917W'},
  {name:'Jornada divulgativa del nuevo plan de ayudas a la innovación y desarrollo',date:'15/10/2009',assistants:43,amount:0,owner:'13744917W'},
  {name:'I Comité de Seguimiento',date:'15/10/2009',assistants:29,amount:8197.36,owner:'13744917W'},
  {name:'Inauguración del II Comité de Seguimiento del PO FEDER',date:'15/10/2009',assistants:25,amount:0,owner:'13744917W'},
  {name:'II Comité de Seguimiento del PO FEDER',date:'15/10/2009',assistants:25,amount:6027.98,owner:'13744917W'},
  {name:'Presentación del programa de actividades del Día de Europa 2009',date:'15/10/2009',assistants:15,amount:0,owner:'13744917W'},
  {name:'6 cursos sobre pizarra digital en diversos ámbitos de la Junta de Extremadura',date:'19/04/2012',assistants:765,amount:0,owner:'08866882Z'},
  {name:'Foro Intelitur Palma de Mallorca',date:'09/06/2011',assistants:100,amount:470.00,owner:'50837161P'},
  {name:'Feria Hofex dos mil once cofinanciado con FEDER',date:'08/11/2011',assistants:6,amount:19200.00,owner:'74496335W'},
  {name:'Foro de Economía y Política Regional celebrado en Ceuta.',date:'11/07/2011',assistants:56,amount:24800.00,owner:'50153239Z'},
  {name:'Jornada informativa sobre la cofinanciación en el Eje 1 del PO FEDER 07-13 de Catalunya para los entes locales. Lleida',date:'15/05/2010',assistants:95,amount:0,owner:'37274514R'}
]);

