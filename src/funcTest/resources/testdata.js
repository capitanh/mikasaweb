db.plans.insertMany([
  {name:'Plan Comunicación País Vasco',plantype:'M'},
  {name:'Plan Comunicación Cataluña',plantype:'M'},
  {name:'Plan Comunicación Galicia',plantype:'M'},
  {name:'Todos los Planes de Comunicación',plantype:'M'}  
]);

db.indicatorTypes.insertMany([
  {description:'Nº actividades y actos públicos'},
  {description:'Nº de acciones de difusión'},
  {description:'Nº de publicaciones externas realizadas'},
]);

db.activities.insertMany([
  {name:'Inauguración del curso Los retos de España ante la política de cohesión europea 2007-2013',date:'15/10/2009',assistants:40,amount:0,owner:'13744917W'},
  {name:'Firma del PO FEDER Cantabria',date:'15/10/2009',assistants:59,amount:0,owner:'13744917W'},
  {name:'Foro Intelitur Palma de Mallorca',date:'09/06/2011',assistants:100,amount:470.00,owner:'50837161P'},
]);
