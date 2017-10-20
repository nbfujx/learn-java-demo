CREATE TABLE `form_element_` (
  `id_` int(11) NOT NULL AUTO_INCREMENT,
  `name_` varchar(128) NOT NULL,
  `extra_properties_` varchar(256) NOT NULL,
  `form_element_properties_` varchar(256) NOT NULL,
  `multiple_` char(1) NOT NULL DEFAULT 'N',
  `company_id_` varchar(128) NOT NULL,
  `form_element_type_` tinyint(4) NOT NULL,
  `form_template_id_` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_`),
  KEY `ind_form_element_form_tempid` (`form_template_id_`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

